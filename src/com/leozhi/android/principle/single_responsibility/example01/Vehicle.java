package com.leozhi.android.principle.single_responsibility.example01;

/**
 * 交通工具类
 * 不遵守单一职责原则
 * @author leozhi
 * @date 2020/8/11
 */
public class Vehicle {
    /**
     * 该方法违反了单一职责原则
     * @param vehicle 交通工具
     */
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。");
    }
}
