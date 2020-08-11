// 迪米特原则
package com.leozhi.android.principle.demeter.example01.refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介
 * @author leozhi
 * @date 2020/8/11
 */
public class Mediator {
    List<Room> roomList = new ArrayList<>();

    public Mediator() {
        for (int i = 0; i < 5; i++) {
            roomList.add(new Room(14 + i, (14 + i) * 150));
        }
    }

    public Room rentOut(float area, float price) {
        for (Room room : roomList) {
            if (isSuitable(area, price, room)) {
                return room;
            }
        }
        return null;
    }

    /**
     * 判断房间是否符合要求
     * 该方法依赖了Room类
     * @param roomArea 房间面积
     * @param roomPrice 租金
     * @param room 房间
     * @return 是否符合要求
     */
    public boolean isSuitable(float roomArea, float roomPrice, Room room) {
        return room.area >= roomArea && room.price <= roomPrice;
    }
}
