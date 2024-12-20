package com.example.junit;

// 整数を計算する電卓
public class Calculator {

    // 足し算
    public int add(int x, int y) {
        return x + y;
    }

    // 引き算
    public int sub(int x, int y) {
        return x - y;
    }

    // 掛け算
    public int mul(int x, int y) {
        return x * y;
    }

    // 割り算(割り算は、整数を計算しても少数を算出する場合もあるためfloat)
    public float div(int x, int y) {

        // 割り算は0で割ることができないtめ、yが0の時は例外を投げる
        if (y==0) {
            throw new IllegalArgumentException("0で割ることはできません");
        }

        // 整数をfloatにキャストして返す
        return (float)x / (float)y;
    }
    
}
