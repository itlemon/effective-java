package cn.itlemon.effective.java.enums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 枚举优雅写法测试
 *
 * @author jiangpingping
 * Created on 2020-09-13
 */
public class EnumMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnumMain.class);

    public static void main(String[] args) {
        LOGGER.info(String.valueOf(BasicOperation.PLUS.apply(1, 2)));
        LOGGER.info(Enum.valueOf(BasicOperation.class, "PLUS").toString());
        LOGGER.info(BasicOperation.valueOf("DIVIDE").toString());
    }
}
