package com.leozhi.android.principle.liskov.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class SubClass1 extends Base {
    /**
     * 返回两个数的差
     * @param num1 被减数
     * @param num2 减数
     * @return 差
     */
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
