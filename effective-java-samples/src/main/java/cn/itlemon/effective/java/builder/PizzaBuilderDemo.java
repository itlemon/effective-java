package cn.itlemon.effective.java.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.itlemon.effective.java.builder.CalzonePizza.Builder;
import cn.itlemon.effective.java.builder.NyPizza.Size;
import cn.itlemon.effective.java.builder.Pizza.Topping;

/**
 * @author jiangpingping
 * Created on 2020-08-26
 */
public class PizzaBuilderDemo {

    private static final Logger logger = LoggerFactory.getLogger(PizzaBuilderDemo.class);

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
        CalzonePizza calzonePizza = new Builder().sauceInside().addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
        logger.info("result:{}", nyPizza);
        logger.info("result:{}", calzonePizza);
    }

}
