package com.leozhi.android.principle.open_close.example01.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
