package com.leozhi.android.principle.single_responsibility.example01;

/**
 * @author leozhi
 * @date 2020/8/11
 */
public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("公共汽车");
        vehicle.run("飞机");
    }
}
/**
 * Output
 * 汽车在公路上运行。
 * 公共汽车在公路上运行。
 * 飞机在公路上运行。
 */