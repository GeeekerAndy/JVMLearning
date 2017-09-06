package chapter10;

/**
 * 包装类的“==”运算在不遇到算数运算的情况下不会自动拆箱，
 * 以及它们的equals()方法不处理数据转型的关系，
 * 应当避免这类的自动拆箱和装箱
 */

public class TrapOfAutoPack {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Integer h = 642;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(e == f + 0);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(h ==(e + f));
        System.out.println(h.equals(e + f));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }
}
