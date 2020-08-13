package com.leozhi.android.principle.inversion.refactor;

/**
 * @author leozhi
 * @date 2020/8/13
 */
public class Wechat implements Sender {
    @Override
    public String getInfo() {
        return "微信信息：Hello, World";
    }
}
