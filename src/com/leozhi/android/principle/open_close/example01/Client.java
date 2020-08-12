// 开闭原则
package com.leozhi.android.principle.open_close.example01;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Client {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());

        // 调用绘制三角形的方法
        graphicEditor.drawTriangle(new Triangle());
    }
}
/**
 * 绘制矩形
 * 绘制圆形
 * 绘制三角形
 */