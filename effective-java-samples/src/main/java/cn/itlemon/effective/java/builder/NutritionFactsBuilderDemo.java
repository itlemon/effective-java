package cn.itlemon.effective.java.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.itlemon.effective.java.builder.NutritionFacts.Builder;

/**
 * @author jiangpingping
 * Created on 2020-08-25
 */
public class NutritionFactsBuilderDemo {

    private static final Logger logger = LoggerFactory.getLogger(NutritionFactsBuilderDemo.class);

    public static void main(String[] args) {
        NutritionFacts build = new Builder(10, 20)
                .calories(10)
                .fat(10)
                .carbohydrate(20)
                .sodium(5)
                .build();
        logger.info("result:{}", build);
    }
}
