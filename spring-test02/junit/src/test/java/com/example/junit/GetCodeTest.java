package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GetCodeTest {

    // getNameのテスト
    @Test
    void testGetName() {

        // テストオブジェクトを生成
        GetCode getCode = new GetCode("なまえ いち", "北海道" );
        // 期待値を作成する
        String expected = "なまえ いち";
        // 実測値を作成する
        String actual = getCode.getName();
        // 期待値を実測値を比較する
        assertEquals(expected, actual);
    }

    // getAreaのテスト
    @Test
    void testGetArea() {

        // テストオブジェクトを生成
        GetCode getCode = new GetCode("なまえ いち", "北海道" );
        // 期待値を作成する
        String expected = "北海道";
        // 実測値を作成する
        String actual = getCode.getArea();
        // 期待値と実測値を比較する
        assertEquals(expected, actual);
    }

    // getNameとgetAreaのテストをまとめて書いた場合のテスト
    @Test
    void testGetNameAndArea() {

        // テストオブジェクトを生成
        GetCode getCode = new GetCode("なまえ 全て", "青森県" );
        
        // 期待値を実測値を比較する
        assertAll("テスト失敗",
                () -> assertEquals("なまえ 全て", getCode.getName()),
                () -> assertEquals("青森県", getCode.getArea()));
    }
}