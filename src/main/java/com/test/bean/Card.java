package com.test.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Card {

    private String color;

}
