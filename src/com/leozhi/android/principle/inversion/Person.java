package com.leozhi.android.principle.inversion;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(Wechat wechat) {
        System.out.println(wechat.getInfo());
    }
}
