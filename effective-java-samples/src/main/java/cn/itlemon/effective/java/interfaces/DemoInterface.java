package cn.itlemon.effective.java.interfaces;

/**
 * @author jiangpingping
 * Created on 2020-08-30
 */
@FunctionalInterface
public interface DemoInterface<T> {

    void accept(T t);
}
