// 迪米特原则
package com.leozhi.android.principle.demeter.example01;

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

    public List<Room> getRoomList() {
        return roomList;
    }
}
