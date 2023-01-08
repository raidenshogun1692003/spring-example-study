package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {
//
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
//        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
//        vehicle.printHello();


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.setName("this is name");
        System.out.println("componet with bean context is: "+vehicle.getName());
        vehicle.printHello();
    }
}
