package com.leozhi.android.principle.open_close.example01.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
