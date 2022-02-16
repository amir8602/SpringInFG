package com.amir.controllers;

import com.amir.models.ProductDTO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.SecureRandom;
import java.util.ArrayList;

@Controller
@RequestMapping("/product")
public class ProductController {

    ArrayList<ProductDTO> productDTOS = new ArrayList<ProductDTO>() {
        {
            add(new ProductDTO(1, "102", 1000));
            add(new ProductDTO(2, "21", 2000));
        }
    };

    Logger logger = Logger.getLogger(ProductController.class);

    @GetMapping("/show")
    public String show() {
        return "product-show";
    }

    @PostMapping(value = "/save")
    public String save(ProductDTO productDTO) {
        SecureRandom random = new SecureRandom();
        productDTO.setId(random.nextInt(1000));
        productDTOS.add(productDTO);
        logger.debug(productDTO);
        //TODO : must persist dto into database
        return "redirect:/";  //Missing Models when send redirect

    }

    @GetMapping(value = "/get-all")
    public ModelAndView getAll(ModelAndView modelAndView) {
        modelAndView.setViewName("product-list");
        modelAndView.getModelMap().addAttribute("productdto", productDTOS);
        return modelAndView;
    }

    @GetMapping("/detail")
    public String detailWithQueryString(@RequestParam ("id") int dummy) {
        logger.debug(dummy);
        return "product-detail";
    }

    @GetMapping("/detail/{id}")
    public String detailWithPathParam(@PathVariable("id") int id){
        logger.debug(id);
        //TODO: get the product and add it ti model and the dispatch it
        return "product-detail";
    }



}
