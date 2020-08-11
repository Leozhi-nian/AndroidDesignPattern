// 迪米特原则
package com.leozhi.android.principle.demeter.example01.refactor;

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
        System.out.println("租到房子啦！" + mediator.rentOut(roomArea, roomPrice));
    }
}
