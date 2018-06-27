package com.github.ssw.effectivejava.chapter02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class TestController {

    @GetMapping("/message")
    public ExResponse getMessage() {
        return new ExResponse
                .Builder("seungwoo")
                .message(ExResponse.MessageCode.SUCCESS)
                .build();
    }

    public static void main(String[] args) {
        Mpizza mpizza = new Mpizza.Builder(Mpizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .build();

        Dpizza dpizza = new Dpizza.Builder()
                .addTopping(Pizza.Topping.MUSHROOM)
                .sauceInde(true)
                .build();
    }
}
