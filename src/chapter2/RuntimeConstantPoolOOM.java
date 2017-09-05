package chapter2;

/**
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * 适用于1.6之前的版本，常量池在永久代，会产生永久代OOM的异常
 * String.intern()方法：若字符串常量池已经包含一个等于此String对象的字符串，则返回常量池中的对象；
 * 否则将此字符串对象添加到常量池并返回String对象引用。
 */

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
