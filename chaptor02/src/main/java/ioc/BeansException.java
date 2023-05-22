package ioc;

/**
 * @author wangzhiming
 * @date 2023/5/17 14:13
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
