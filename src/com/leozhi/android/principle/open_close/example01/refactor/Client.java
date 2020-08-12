package com.leozhi.android.principle.open_close.example01.refactor;

/**
 * @author leozhi
 * @date 2020/8/12
 */
public class Client {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
/**
 * 绘制矩形
 * 绘制圆形
 * 绘制三角形
 */