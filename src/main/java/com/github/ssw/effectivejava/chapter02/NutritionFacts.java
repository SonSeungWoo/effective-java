package com.github.ssw.effectivejava.chapter02;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class NutritionFacts {

    @Builder.Default private int servingSize; //제외한 생성자 생성
    private int servings;
    private int calories;
    private int sodium;
    private int carbohydrate;
    @Singular private List<String> names;

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = NutritionFacts.builder()
                .servings(10)
                .calories(4)
                .name("seung")
                .name("woo")
                .build();
    }
}
