package com.example.th.demoth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mqx
 * @date 2020/3/16 19:52
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("name","刘德华");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("刘德华");
        arrayList.add("张柏芝");
        arrayList.add("谢霆锋");
        arrayList.add("刘亦菲");

        request.setAttribute("age",18);
        request.setAttribute("arrayList",arrayList);
        request.setAttribute("userName","哈哈");
        request.setAttribute("gname","<span style=color:green>宝强</span>");

        request.setAttribute("category1Id",61);
        return "index";
    }

    @RequestMapping("list.html")
    public String index(String category1Id,HttpServletRequest request){
        request.setAttribute("category1Id",category1Id);
        return "list";
    }
}
