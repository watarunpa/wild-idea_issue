package com.example.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserJudgeTest {

    @ParameterizedTest
    @CsvSource({
        "20, '沖縄県', 1",
        "20, '沖縄県', 0",
        "20, '鹿児島県', 1",
        "19, '沖縄県', 1"
    })
    void testCheckBonus(int age, String address, int count) {
        UserJudge userJudge = new UserJudge();
        assertTrue(userJudge.checkBonus(age, address, count));
    }
}
