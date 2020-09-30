package de.experience.adventOfCode.controller;

import de.experience.adventOfCode.model.Input;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    @GetMapping("/input")
    public String inputForm(Model model) {
        model.addAttribute("input", new Input());
        return "input";
    }

    @PostMapping("/input")
    public String inputSubmit(@ModelAttribute Input input, Model model) {
        model.addAttribute("input", input);
        return "output";
    }
}
