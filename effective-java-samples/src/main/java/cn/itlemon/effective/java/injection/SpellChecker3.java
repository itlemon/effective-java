package cn.itlemon.effective.java.injection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 方式三，依赖注入：这种方式相对于前两种方式要灵活许多，可以将词典设置为接口方式，这样可以传递多种类型的词典
 *
 * @author jiangpingping
 * Created on 2020-08-29
 */
public class SpellChecker3 {

    private final Dictionary dictionary;

    public SpellChecker3(Dictionary dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        // do something
        return true;
    }

    public List<String> suggestions(String typo) {
        // do something
        return new ArrayList<>();
    }

}
