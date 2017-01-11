package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by brittmo on 1/4/17.
 */
@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String roll() {
        return "roll_dice";
    }
    @GetMapping("/roll-dice/{guess}")
    public String roll(@PathVariable int guess, Model model) {
        int randomNumber = (int) Math.floor(Math.random()*6) + 1;
        boolean isCorrect = guess == randomNumber;
        model.addAttribute("isCorrect", isCorrect);
        model.addAttribute("random", randomNumber);
        model.addAttribute("guess", guess);
        return "/roll_dice";
    }

}

