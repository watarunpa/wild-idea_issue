package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // 足し算のテストメソッド
    @Test
    void testAdd() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();
        // 期待値を作成する
        int expected = 13;
        // 実測値を作成する
        int actual = cal.add(7, 6);
        // 期待値を実測値を比較する
        assertEquals(expected, actual);
    }

    // 引き算のテストメソッド
    @Test
    void testSub() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();
        // 期待値を作成する
        int expected = 1;
        // 実測値を作成する
        int actual = cal.sub(7, 6);
        // 期待値を実測値を比較する
        assertEquals(expected, actual);
    }

    // 掛け算のテストメソッド
    @Test
    void testMul() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();
        // 期待値を作成する
        int expected = 42;
        // 実測値を作成する
        int actual = cal.mul(7, 6);
        // 期待値を実測値を比較する
        assertEquals(expected, actual);
    }

    // 割り算のテストメソッド
    @Test
    void testDiv() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();
        // 期待値を作成する
        float expected = 1.1666666f;
        // 実測値を作成する
        float actual = cal.div(7, 6);
        // 期待値を実測値を比較する
        assertEquals(expected, actual);
    }

    // 割り算のテストメソッド(0で割る場合の書き方その1)
    @Test
    void testDivException() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();
        try {
            cal.div(7,0);

            // 強制的に失敗させる処理
            fail();
        } catch(IllegalArgumentException e) {
            // ここに入れば成功
        }
    }

    // 割り算のテストメソッド(0で割る場合の書き方その2)
    @Test
    void testDivException2() {

        // テストオブジェクトを生成
        Calculator cal = new Calculator();

        // ラムダ式は、その場限りのメソッドを生成する時に使う
        assertThrows(IllegalArgumentException.class, () -> cal.div(7, 0));
    }
}
