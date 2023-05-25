package ioc.factory.support;

import ioc.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:05
 */
// 默认的单例注册实现
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    // 利用哈希表确保单例
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
