package com.example;

public abstract class Employee {
    abstract  void work();
    abstract  void takePause();
    abstract  void getPaid();

    public  final void comToWork(){
        work();
        takePause();
        getPaid();
    }
}
