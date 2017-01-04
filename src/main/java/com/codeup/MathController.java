package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brittmo on 1/4/17.
 */
@Controller
public class MathController {

    @GetMapping("/add/{x}/and/{y}")
    @ResponseBody
    public int add(@PathVariable int x, @PathVariable int y) {
        return x +y;
    }

    @GetMapping("/subtract/{x}/from/{y}")
    @ResponseBody
    public int subtract(@PathVariable int x, @PathVariable int y){
        return y - x;
    }
    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public int multiply(@PathVariable int x, @PathVariable int y){
        return x * y;
    }
    @GetMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public int divide(@PathVariable int x, @PathVariable int y){
        return x / y;
    }
}
