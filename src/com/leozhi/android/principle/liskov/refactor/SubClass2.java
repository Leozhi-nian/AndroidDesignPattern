package com.leozhi.android.principle.liskov.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class SubClass2 extends Base {
    /**
     * 如果SubClass2类需要用到SubClass1类的方法，使用组合关系
     */
    private SubClass1 a = new SubClass1();

    /**
     * 返回两数之和
     * 该方法与SubClass1类中的同名方法没有任何关系
     * @param a 参数a
     * @param b 参数b
     * @return 两数之和
     */
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    /**
     * 使用SubClass1类中的方法
     * @param a 参数a
     * @param b 参数b
     * @return 调用SubClass1类的func1()
     */
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
