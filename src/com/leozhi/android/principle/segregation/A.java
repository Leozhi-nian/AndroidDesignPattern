package com.leozhi.android.principle.segregation;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class A {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }
    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}
