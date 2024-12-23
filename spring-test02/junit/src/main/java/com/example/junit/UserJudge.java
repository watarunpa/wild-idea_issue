package com.example.junit;

public class UserJudge {

    public UserJudge() {
    }

    public boolean checkBonus(int age, String address, int count) {

        if(age >= 20 && address.contentEquals("沖縄県") && count >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
