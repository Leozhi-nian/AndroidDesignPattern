package com.leozhi.android.principle.segregation.refactor;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }
    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}
