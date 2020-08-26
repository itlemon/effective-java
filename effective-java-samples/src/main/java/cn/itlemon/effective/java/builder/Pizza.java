package cn.itlemon.effective.java.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 披萨抽象类
 *
 * @author jiangpingping
 * Created on 2020-08-26
 */
public abstract class Pizza {

    public enum Topping {
        /**
         * 火腿，蘑菇，洋葱，胡椒粉，香肠
         */
        HAM,
        MUSHROOM,
        ONION,
        PEPPER,
        SAUSAGE
    }

    private final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {

        private final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        /**
         * 子类必须覆盖该方法，并且返回this
         *
         * @return 子类自身对象
         */
        protected abstract T self();

        /**
         * 子类必须重写该方法，并且返回子类对象
         *
         * @return 子类自身对象
         */
        protected abstract Pizza build();
    }

    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return "Pizza{"
                + "toppings="
                + toppings
                + '}';
    }
}
