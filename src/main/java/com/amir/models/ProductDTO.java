package com.amir.models;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ProductDTO {
    private  Integer id;
    private String name;
    private Integer price;
    private String type;
    private Map<String,String> validTypes;

    public ProductDTO(){
        validTypes =new HashMap<String , String>();
        validTypes.put("1","home");
        validTypes.put("2","school");
        validTypes.put("3","work");
    }


    public ProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(Integer id, String name, Integer price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
