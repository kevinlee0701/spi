package spi;

/**
 * Created by lifeng on 2018/7/17.
 */
public class RedService implements DubboService {
    public void sayHello() {
        System.out.println("我是：RedService");
    }
}
