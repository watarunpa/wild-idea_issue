package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputPageController {

    @ModelAttribute
    public CheckForm setUpForm() {
        return new CheckForm();
    }

    //入力画面に遷移する
    @RequestMapping(value = "/input")
    private String toInputPageController() {
        return "index";
    }

    //確認画面に遷移する
    @RequestMapping(value = "/chkScreen")
    private String result(@Validated CheckForm checkForm, BindingResult bindingResult, Model model) {

        //アノテーションによるチェック処理結果がエラーの場合、入力画面に遷移する
        if (bindingResult.hasErrors()) {
            return "index";
        }

        String number = checkForm.getNumber();

        TesService tesService = new TesServiceImpl();
        String name = tesService.findByNo(number);

        model.addAttribute("number", number);
        model.addAttribute("name", name);
        return "check";
    }
}
