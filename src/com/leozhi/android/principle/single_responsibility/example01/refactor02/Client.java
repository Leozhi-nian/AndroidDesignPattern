package com.leozhi.android.principle.single_responsibility.example01.refactor02;

/**
 * @author leozhi
 * @date 2020/8/11
 */
public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runRoad("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}
/**
 * Output
 * 汽车在公路上运行。
 * 飞机在天空中运行。
 * 轮船在水中运行。
 */