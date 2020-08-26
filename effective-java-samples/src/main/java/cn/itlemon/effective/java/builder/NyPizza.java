package cn.itlemon.effective.java.builder;

import java.util.Objects;

/**
 * 经典纽约风味披萨
 *
 * @author jiangpingping
 * Created on 2020-08-26
 */
public final class NyPizza extends Pizza {

    public enum Size {
        /**
         * 尺寸
         */
        SMALL,
        MEDIUM,
        LAGER
    }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(self());
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{"
                + "size="
                + size
                + "} "
                + super.toString();
    }
}
