package cn.itlemon.effective.java.enums;


/**
 * @author jiangpingping
 * Created on 2020-09-13
 */
public interface Operation {

    /**
     * 计算
     *
     * @param x 第一个参数
     * @param y 第二个参数
     * @return Double类型结果
     */
    double apply(double x, double y);


}
