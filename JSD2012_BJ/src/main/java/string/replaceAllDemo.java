package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * String 支持正则表达式的方法之三：
 *
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 */
public class replaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi789jkl";
        //将满足的部分替换为空字符串可以达到“去除”的效果。
        String str1 = str.replaceAll("[0-9]+","");
        System.out.println(str);
        String str2 = str.replaceAll("[a-z]+","");
        System.out.println(str);

        //和谐用语
        String regex = "(wqnmlgb|dsb|mdzz|cnm|nmsl|nc|nt|fk|djb|wcnm)";
        String message = "fk!你个dsb！";
        message = message.replaceAll(regex,"###");
        System.out.println(message);
    }
}
