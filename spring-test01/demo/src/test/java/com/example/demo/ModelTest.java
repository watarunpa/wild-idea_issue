package com.example.demo;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
public class ModelTest {

    private MockMvc mockMvc;

    @Autowired
    InputPageController target;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @MockitoBean    //Spring Boot 3.4.0以降 MockBean非推奨
    private TesService tesService;

    @Test
    public void isModelTest() throws Exception {

        //InputPageContollerのmodelに値がセットされているかのテスト
        when(tesService.findByNo("1000")).thenReturn("DI あり いち");
        mockMvc.perform(post("/chkScreen?number=1000")).andExpect(model().attribute("name", "DI あり いち"));
    }

    @Test
    public void isModelTest2() throws Exception {

        //InputPageContollerのmodelに値がセットされているかのテスト
        when(tesService.findByNo("1001")).thenReturn("DI あり に");
        mockMvc.perform(post("/chkScreen?number=1001")).andExpect(model().attribute("name", "DI あり に"));
    }
}
