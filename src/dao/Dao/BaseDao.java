package dao.Dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 方便代码复用
 * 什么是dbutils
 * 它的出现就是封装了jdbc的代码，开发dao层代码的简单框架
 * 框架的作用就是为你完成一些工作
 */
public class BaseDao {
     //使用dbUtils操作数据库
    /**
     * QueryRunner类实现更新 使用QueryRunner类实现更新(增、删、改、批处理)
     */
    private QueryRunner queryRunner=new QueryRunner();

    /**
     * 实现数据更新:插入，更新，删除
     * Object...args可变长参数
     * 失败返回-1，成功返回影响条数
     * @return
     */
    public int update(String sql,Object...args){
        Connection con= jdbcUtils.getconnection();
        try {
             return queryRunner.update(con,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();

        }finally{
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return -1;

    }

    /**<T>T: 第一个 表示是泛型
     *     第二个 表示返回的是T类型的数据
     * 查找返回一个javaBean的sql语句
     * @param type 返回的对象类型
     * @param sql sql语句
     * @param args sql对象的参数值
     * @param <T> 返回的类型泛型
     * @return
     * BeanHandler：将结果集中的第一行数据封装到一个对应的JavaBean实例中。
     * BeanListHandler：将结果集中的每一行数据都封装到一个对应的JavaBean实例中，存放到List里。
     * new BeanHandler<T>(type)返回结果集中的第一行数据用type类型接收
     */
    public <T> T Queryforone(Class <T> type,String sql,Object...args){
        Connection con= jdbcUtils.getconnection();
        try {
           return  queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();

        }finally{
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }

    /**
     * 查找返回多个javaBean的sql语句
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T> List<T> QueryforList(Class<T> type, String sql, Object...args){
        Connection con= jdbcUtils.getconnection();
        try {
            return  queryRunner.query(con,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     *  ScalarHandler: 可以返回指定列的头一个值或返回一个统计函数的值.
     * 执行并返回一行一列的sql语句
     * @param sql 执行的sql语句
     * @param args sql对应的参数值
     * @return 用于返回内容的条数 number接收
     * ScalarHandler()返回聚合函数的值
     */
    public Object Queryforsingalone(String sql, Object...args){
        Connection connection= jdbcUtils.getconnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();

        }finally{
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }


    }

