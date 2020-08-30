package cn.itlemon.effective.java.injection;

import java.util.ArrayList;
import java.util.List;

/**
 * 方式一，静态工具类：将词典做为拼写检查器的静态内部属性，这种方式不能扩展词典，这种工具类不推荐写，无扩展性
 *
 * @author jiangpingping
 * Created on 2020-08-29
 */
public class SpellChecker1 {

    private static final Dictionary DICTIONARY = new Dictionary();

    private SpellChecker1() {
    }

    public static boolean isValid(String word) {
        // do something
        return true;
    }

    public static List<String> suggestions(String typo) {
        // do something
        return new ArrayList<>();
    }
}
