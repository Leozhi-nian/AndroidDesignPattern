package com.leozhi.android.principle.single_responsibility.example01.refactor01;

/**
 * 类遵守单一职责原则
 * @author leozhi
 * @date 2020/8/11
 */
public class Client {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}
/**
 * 汽车在公路上运行
 * 飞机在天空中运行
 * 轮船在水中运行
 */