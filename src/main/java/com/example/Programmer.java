package com.example;

public class Programmer extends Employee {
    @Override
    public  void work(){
        System.out.println("Viet code");
     }

     @Override
    public  void takePause(){
        System.out.println("Tam dung viet code");
     }

     @Override
    public  void getPaid(){
         System.out.println("Linh luong sau khi hoan thanh du an");
     }
}
