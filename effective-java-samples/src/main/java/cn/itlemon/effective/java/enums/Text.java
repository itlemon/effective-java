package cn.itlemon.effective.java.enums;

import java.util.Set;

/**
 * @author jiangpingping
 * Created on 2020-09-13
 */
public class Text {

    public enum Style {
        /**
         * 字体样式：加粗，斜体，下划线，删除线
         */
        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
    }

    public void applyStyles(Set<Style> styles) {

    }

}
