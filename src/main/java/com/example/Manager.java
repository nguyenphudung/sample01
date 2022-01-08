package com.example;

public class Manager  extends  Employee{
    @Override
    public  void work(){
        System.out.println("Quan ly nhan vien");
    }

    @Override
    public  void takePause(){
        System.out.println("Tam dung quan ly nhan vien");
    }

    @Override
    public  void getPaid(){
        System.out.println("Linh luong cho cong viec quan ly nhan vien");
    }
}
