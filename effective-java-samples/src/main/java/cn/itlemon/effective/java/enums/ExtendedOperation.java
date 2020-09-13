package cn.itlemon.effective.java.enums;

/**
 * @author jiangpingping
 * Created on 2020-09-13
 */
public enum ExtendedOperation implements Operation {

    /**
     * 幂与求余
     */
    EXP {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },

    REMAINDER {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    }

}
