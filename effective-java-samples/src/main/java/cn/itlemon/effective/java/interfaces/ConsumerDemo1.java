package cn.itlemon.effective.java.interfaces;

import java.util.function.Consumer;

/**
 * {@link java.util.function.Consumer} 接口演示
 *
 * @author jiangpingping
 * Created on 2020-08-30
 */
public class ConsumerDemo1 {

    public static void main(String[] args) {
        test(System.out::println);
    }

    public static void consumer(Consumer<String> function) {
        function.accept("Hello World.");
    }

    public static void test(DemoInterface<String> demoInterface) {
        demoInterface.accept("hello");
    }

}
