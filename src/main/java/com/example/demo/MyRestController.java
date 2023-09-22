package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyRestController {

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public OutputObject myHandler(@RequestBody InputObject input) {

        OutputObject output = new OutputObject();
        output.setField1(input.getField1());
        output.setResult(String.valueOf((int)(Math.random() * 100)));
        return output;

    }

}