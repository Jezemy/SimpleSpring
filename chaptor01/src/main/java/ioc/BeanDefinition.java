package ioc;

/**
 * @author wangzhiming
 * @date 2023/5/22 14:31
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
