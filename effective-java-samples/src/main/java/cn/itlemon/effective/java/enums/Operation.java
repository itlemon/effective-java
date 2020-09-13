package cn.itlemon.effective.java.enums;

/**
 * @author jiangpingping
 * Created on 2020-09-13
 */
public enum Operation {

    /**
     * 加减乘除
     */
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },

    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },

    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    public abstract double apply(double x, double y);

}
