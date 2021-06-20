package utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class webUtils {
    /**
     * beanUtils工具类
     * 可以一次性把所有的请求的参数注入到javaBean中。
     *
     * @param value
     * @param bean
     */
    public static <T> T BeanUtils(Map value, T bean) {
        try {
            BeanUtils.populate(bean, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String strInt, int defaultValue) {
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
            /*e.printStackTrace();*/
        }
        return defaultValue;

    }
}
