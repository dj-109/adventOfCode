package de.experience.adventOfCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    // TODO: Links in die index.html einbinden
    @RequestMapping("/other")
    public String other() {
        return "other";
    }

    //@ResponseBody ist bei der @RestController Annotation inkludiert
    @GetMapping("/ban")
    public @ResponseBody String banana() {
        String ban = "ban";
        return ban + "babanana";
    }


}