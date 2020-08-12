package com.leozhi.android.principle.open_close.example01.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public abstract class Shape {
    int m_type;

    /**
     * 抽象方法，用于绘制图形
     */
    public abstract void draw();
}
