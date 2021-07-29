package com.projects.server_v2.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {
    private Long pdId; //상품 id

    @NonNull
    private String pdName; //상품 이름

    @NonNull
    private int pdPrice; //상품 가격

    private String pdDesc; //상품 설명
}
