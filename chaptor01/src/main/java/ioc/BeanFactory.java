package ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangzhiming
 * @date 2023/5/22 14:32
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}