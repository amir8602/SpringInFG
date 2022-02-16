package com.amir.controllers;

import com.amir.models.ProductDTO;
import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product/rest")
public class ProductRestService {
    Logger logger = Logger.getLogger(ProductRestService.class);
    ArrayList<ProductDTO> productDTOS = new ArrayList<ProductDTO>() {
        {
            add(new ProductDTO(1, "102", 1000));
            add(new ProductDTO(2, "21", 2000));
        }
    };

    @GetMapping(value = "/detail/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDTO detailWithPathParam(@PathVariable("id") int id){
        logger.debug(id);
        //TODO: get the product and add it ti model and the dispatch it
        return productDTOS.get(0);
    }

}
