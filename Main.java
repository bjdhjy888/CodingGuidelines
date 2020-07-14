// 注释的双斜线与注释内容之间有且仅有一个空格

// Learning Objective: 编程规范、提高一致性、可读性、沟通效率
// Definition: Coding Guidelines
// Purpose: 提高研发效率
// Source Code: https://github.com/bjdhjy888/CodingGuidelines
// See also: https://github.com/alibaba/p3c

// 包名统一使用小写，点分隔符之间有且仅有一个自然语义的英语单词，统一使用单数形式。但类名如果有复数含义，使用复数形式
package com.company;

public class Main {

    // 左大括号前不换行，左大括号后换行
    public static void main(String[] args) {
        // 运算符的左右必须有1个空格
        President myPresident = new President();

        // 不同逻辑、不同语义、不同业务的代码之间插入一个空行分隔开来，以提升可读性
        myPresident.setNameOfPresident("Trump");
        myPresident.setHeartRateOfPresident(150);

        System.out.print(myPresident.nameOfPresident + " says: ");
        myPresident.Speak(myPresident.nameOfPresident);

        Doctor DoctorOfTrump = new Doctor();
        DoctorOfTrump.CheckHealth(myPresident.heartRateOfPresident);

        Surgeon SurgeonOfTrump = new Surgeon();

        SurgeonOfTrump.CheckHealth(myPresident.heartRateOfPresident);

        SurgeonOfTrump.TransplantHeart(myPresident.heartRateOfPresident);
    // 右大括号前换行
    }
}
