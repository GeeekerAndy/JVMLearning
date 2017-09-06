package chapter10;

import java.util.Arrays;
import java.util.List;

public class AutoPackAndForeach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        System.out.println(sum);

        //编译之后：
        /*
        List<Integer> list = Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4));
        int sum = 0;

        int i;
        for(Iterator var3 = list.iterator(); var3.hasNext(); sum += i) {
            i = ((Integer)var3.next()).intValue();
        }

        System.out.println(sum);
         */
    }
}
