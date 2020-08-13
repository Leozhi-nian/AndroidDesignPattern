package com.leozhi.android.principle.liskov;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class SubClass extends BaseClass {
    /**
     * 重写了BaseClass类的方法，可能是无意识的
     * 此时func1方法变为了返回两数之和
     * @param a 参数a
     * @param b 参数b
     * @return 两数之和
     */
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
