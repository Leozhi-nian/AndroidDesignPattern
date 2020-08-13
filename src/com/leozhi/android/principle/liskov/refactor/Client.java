package com.leozhi.android.principle.liskov.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Client {
    public static void main(String[] args) {
        SubClass1 a = new SubClass1();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("----------------");
        SubClass2 b = new SubClass2();
        System.out.println("11 + 3 = " + b.func1(11, 3));
        System.out.println("1 + 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.func2(11, 3));

        // 使用A类中的方法
        System.out.println("11 - 3 = " + b.func3(11, 3));
    }
}
/**
 * 11 - 3 = 8
 * 1 - 8 = -7
 * ----------------
 * 11 + 3 = 14
 * 1 + 8 = 9
 * 11 + 3 + 9 = 23
 * 11 - 3 = 8
 */