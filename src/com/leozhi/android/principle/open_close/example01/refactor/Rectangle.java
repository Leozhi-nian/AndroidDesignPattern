package com.leozhi.android.principle.open_close.example01.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
