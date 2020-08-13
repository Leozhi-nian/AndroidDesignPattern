package com.leozhi.android.principle.segregation;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }
    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}
