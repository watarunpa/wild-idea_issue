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
        public Stack<Object> stack;
        public String aaa = "a";

        @BeforeEach
        public void createNewStack() {
            stack = new Stack<>();
        }

        @Test
        @DisplayName("スタックが空の状態の時、isEmptyメソッドがtrueを返す")
        public void isEmpty() {
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("スタックが空の状態の時、popメソッドを実行するとEmptyStackExceptionがスローされる")
        public void throwsExceptionWhenPopped() {
            assertThrows(EmptyStackException.class, () -> stack.pop());
        }
        
        @Nested
        @DisplayName("スタックに1回pushした状態")
        public class afterPushing {

            @BeforeEach
            public void pushAnElement() {
                stack.push(aaa);
            }
            
            @Test
            @DisplayName("スタックに1回pushした状態で、isEmptyメソッドがfalseを返す")
            public void isNotEmpty() {
                assertFalse(stack.isEmpty());
            }
            
            @Test
            @DisplayName("スタックに1回pushした状態で、popメソッドを実行すると、pushした内容と一致する")
            public void returnElementWhenPopped() {
                assertEquals(aaa, stack.pop());
            }
        }
    }
}
