package com.example.junit;

import java.util.EmptyStackException;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("StackTest")
public class StackTest {

    @Nested
    @DisplayName("スタックが空の状態のケースのグループ")
    public class whenNew {

        @Test
        @DisplayName("スタックが空の状態の時、isEmptyメソッドがtrueを返す")
        public void isEmpty() {
            Stack<Object> stack = new Stack<>();
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("スタックが空の状態の時、popメソッドを実行するとEmptyStackExceptionがスローされる")
        public void throwsExceptionWhenPopped() {
            Stack<Object> stack = new Stack<>();
            assertThrows(EmptyStackException.class, () -> stack.pop());
        }
    }

    @Nested
    @DisplayName("スタックに1回pushした状態")
    public class afterPushing {

        @Test
        @DisplayName("スタックに1回pushした状態で、isEmptyメソッドがfalseを返す")
        public void isNotEmpty() {
            Stack<Object> stack = new Stack<>();
            stack.push("a");
            assertFalse(stack.isEmpty());
        }

        @Test
        @DisplayName("スタックに1回pushした状態で、popメソッドを実行すると、pushした内容と一致する")
        public void returnElementWhenPopped() {
            Stack<Object> stack = new Stack<>();
            String aaa = "a";
            stack.push("a");
            assertEquals(aaa, stack.pop());
        }
    }
}
