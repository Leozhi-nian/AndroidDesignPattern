package com.leozhi.android.principle.single_responsibility.example01.refactor02;

/**
 * 交通工具类
 * 方法遵守单一职责原则
 * @author leozhi
 * @date 2020/8/11
 */
public class Vehicle {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行。");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空中运行。");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行。");
    }
}
