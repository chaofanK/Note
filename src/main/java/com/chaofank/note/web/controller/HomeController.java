package com.chaofank.note.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("index")
    @ResponseBody
    public String index(Model model) {

        return "String";
    }
}
