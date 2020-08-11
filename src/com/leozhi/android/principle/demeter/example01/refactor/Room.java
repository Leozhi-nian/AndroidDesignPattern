// 迪米特原则
package com.leozhi.android.principle.demeter.example01.refactor;
/**
 * 传统示例
 * @author leozhi
 * @date 2020/8/11
 */
public class Room {
    public float area;
    public float price;

    /**
     * 房间信息
     * @param area 面积
     * @param price 租金
     */
    public Room(float area, float price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", price=" + price +
                '}';
    }
}
