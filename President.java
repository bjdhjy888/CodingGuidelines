// 另请参阅《阿里巴巴Java开发手册》 杨冠宝

package com.company;

public class President {
    // 方法名、参数名、成员变量、局部变量都统一使用lowerCamelCase风格，必须遵从驼峰形式
    public String nameOfPresident;
    public int heartRateOfPresident;

    public void setNameOfPresident(String newName){
        // 成员变量必须遵从驼峰形式
        nameOfPresident = newName;
    }

    public void setHeartRateOfPresident(int newRate){
        // 成员变量必须遵从驼峰形式
        heartRateOfPresident = newRate;
    }

    // 参数名必须遵从驼峰形式
    public void Speak(String nameOfPresident){
        // 左小括号和字符之间不出现空格
        if(nameOfPresident == "Trump") {
            System.out.println("Make America Great Again!");
        }
    }
}
