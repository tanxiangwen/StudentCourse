/**
 * 数据库连接池
 * DruidDataSourceFactory.createDataSource获取连接池对象((DruidDataSource))
 *  DruidDataSource druidDataSource一个数据库连接池变量
 *  InputStream resourceAsStream = jdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties")
 *  读取src目录下的jdbc配置文件
 * properties.load(resourceAsStream)流中加载数据
 * getClassLoader()获取当前类加载器
 * getResourceAsStream(path)是用来获取资源的，
 * 而类加载器默认是从classPath下获取资源的，因为这下面有class文件吗，所以这段代码总的意思是通过类加载器在classPath目录下获取资源.并且是以流的形式。
 */
package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcUtils {
    //数据库连接池
    private static DruidDataSource druidDataSource;
    //利用线程进行事务管理
  //  private static ThreadLocal<Connection>conns=new ThreadLocal<>();
    static {
       // Properties properties=new Properties();
        //文件流
      //  InputStream resourceAsStream = jdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            //读取jdbc.properties文件
            Properties properties=new Properties();
            InputStream resourceAsStream = jdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //从流中加载数据
            properties.load(resourceAsStream);

            //获取连接池对象
            druidDataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
           // System.out.println(druidDataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接池中的链接
     * @return
     */
    public static Connection getconnection(){
          Connection con=null;
        try {
            con=druidDataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }

    /**
     *关闭链接
     */
    public static void close(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    //获取链接
   /* public static Connection getconnection(){
        Connection connection=conns.get();
        if(connection==null){

            try {
                //从数据库连接池中获取链接
                connection= druidDataSource.getConnection();
                conns.set(connection);//保存到线程ThreadLocal对象中供后边jdbc工具使用
                //手动管理事务
                connection.setAutoCommit(false);



            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return connection;

    }
    public static void commitAndclose(){
        Connection connection = conns.get();
        if(connection!=null){
            try {
                connection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        conns.remove();
    }
    public static void rollbackAndclose(){
        Connection connection = conns.get();
        if(connection!=null){
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally{
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        conns.remove();
    }*/
}


