package com.leozhi.android.principle.inversion.refactor;

import com.leozhi.android.principle.inversion.Email;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Person {
    public void receive(Sender sender) {
        System.out.println(sender.getInfo());
    }
}
