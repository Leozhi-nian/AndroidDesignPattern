package com.leozhi.android.principle.open_close.example01;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle(shape);
        } else if (shape.m_type == 2) {
            drawCircle(shape);
        } else if (shape.m_type == 3) {
            // 新增绘制三角形
            drawTriangle(shape);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    // 增加绘制三角形的方法
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}
