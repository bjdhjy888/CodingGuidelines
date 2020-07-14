package com.company;

// 单个方法的总行数不超过80行
public class Doctor {
    public void CheckHealth(int HeartRateOfPresident){
        if(HeartRateOfPresident > 120){
            System.out.println("You are sick.");
        }
    }
}
