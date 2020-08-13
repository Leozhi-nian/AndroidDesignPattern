package com.leozhi.android.principle.liskov;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Client {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println("11 - 3 = " + baseClass.func1(11, 3));
        System.out.println("1 - 8 = " + baseClass.func1(1, 8));

        System.out.println("----------------");
        SubClass subClass = new SubClass();
        System.out.println("11 - 3 = " + subClass.func1(11, 3));
        System.out.println("1 - 8 = " + subClass.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + subClass.func2(11, 3));
    }
}
/**
 * 11 - 3 = 8
 * 1 - 8 = -7
 * ----------------
 * 11 - 3 = 14
 * 1 - 8 = 9
 * 11 + 3 + 9 = 23
 */