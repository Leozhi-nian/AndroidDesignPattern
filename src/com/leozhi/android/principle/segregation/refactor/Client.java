package com.leozhi.android.principle.segregation.refactor;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Client {
    public static void main(String[] args) {
        A a = new A();
        // A类通过接口依赖B类
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        // C类通过接口依赖D类
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}
/**
 * B 实现了 operation1
 * B 实现了 operation2
 * B 实现了 operation3
 * D 实现了 operation1
 * D 实现了 operation4
 * D 实现了 operation5
 */