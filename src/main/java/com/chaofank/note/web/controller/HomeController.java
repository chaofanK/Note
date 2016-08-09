package com.chaofank.note.web.controller;

import com.chaofank.note.bean.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2016-08-05.
 */
@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping(value = "index", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Product index(Model model) {
        Product product = new Product();
        product.setName("AC");
        product.setVendor("Gree");

        return product;
    }

    
}
