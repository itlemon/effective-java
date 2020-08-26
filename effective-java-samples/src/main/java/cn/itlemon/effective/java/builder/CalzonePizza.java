package cn.itlemon.effective.java.builder;

/**
 * 半月形披萨
 *
 * @author jiangpingping
 * Created on 2020-08-26
 */
public final class CalzonePizza extends Pizza {

    /**
     * 馅是否内置
     */
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(self());
        }
    }

    private CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "CalzonePizza{"
                + "sauceInside="
                + sauceInside
                + "} "
                + super.toString();
    }
}
