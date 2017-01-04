package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brittmo on 1/4/17.
 */
@Controller
public class HelloController {


        @GetMapping("/hello/{name}")
        @ResponseBody
        public String hello() {
            return "<h1>Hello from Spring!</h1>";
        }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }
    }

