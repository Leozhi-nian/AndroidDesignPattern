// 迪米特原则
package com.leozhi.android.principle.demeter.example01;

import java.util.List;

/**
 * 租户
 * @author leozhi
 * @date 2020/8/11
 */
public class Tenant {
    /**
     * 租房
     * 该方法依赖了Mediator类
     * @param roomArea 房间面积
     * @param roomPrice 租金
     * @param mediator 中介
     */
    public void rentRoom(float roomArea, float roomPrice, Mediator mediator) {
        List<Room> roomList = mediator.getRoomList();
        for (Room room : roomList) {
            if (isSuitable(roomArea, roomPrice, room)) {
                System.out.println("租到房间啦！" + room);
                break;
            }
        }
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
