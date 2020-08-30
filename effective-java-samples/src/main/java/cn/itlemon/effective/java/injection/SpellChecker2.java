package cn.itlemon.effective.java.injection;

import java.util.ArrayList;
import java.util.List;

/**
 * 方式二，单例模式：将词典做为拼写检查器的内部属性，这种方式不能扩展词典，这种工具类不推荐写，无扩展性
 *
 * @author jiangpingping
 * Created on 2020-08-29
 */
public class SpellChecker2 {

    private final Dictionary dictionary = new Dictionary();

    private SpellChecker2() {
    }

    public static final SpellChecker2 INSTANCE = new SpellChecker2();

    public boolean isValid(String word) {
        // do something
        return true;
    }

    public List<String> suggestions(String typo) {
        // do something
        return new ArrayList<>();
    }

}
