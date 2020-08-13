package com.leozhi.android.principle.inversion.refactor;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Email implements Sender {
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello, World";
    }
}
