package com.company;

public class Surgeon extends Doctor{
    public void TransplantHeart(int HeartRateOfPresident){
        if(HeartRateOfPresident > 140){
            System.out.println("Let me give you a new heart.");
        }
    }
}


