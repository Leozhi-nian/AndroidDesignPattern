package com.leozhi.android.principle.segregation.refactor;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class D implements Interface1,Interface3 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
