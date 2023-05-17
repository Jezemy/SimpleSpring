package ioc.factory.config;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:04
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
