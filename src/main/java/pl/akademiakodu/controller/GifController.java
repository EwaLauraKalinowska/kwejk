package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ewcia on 31.03.17.
 */
@Controller
public class GifController {

    @GetMapping("/")
    public String listGifts(){
        return "home";
    }
}
