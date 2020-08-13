package com.leozhi.android.principle.inversion;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Client {
    public static void main(String[] args) {
        new Person().receive(new Email());
        new Person().receive(new Wechat());
    }
}
/**
 * 电子邮件信息：Hello, World
 * 微信信息：Hello, World
 */