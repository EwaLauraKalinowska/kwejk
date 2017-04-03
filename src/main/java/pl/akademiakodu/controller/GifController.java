package pl.akademiakodu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.akademiakodu.dao.GifRepository;
import pl.akademiakodu.model.Gif;

/**
 * Created by ewcia on 31.03.17.
 */
@Controller
public class GifController {

        @Autowired
        GifRepository gifRepository;

        @GetMapping("/")
        public String listGifts(ModelMap modelMap){
            modelMap.addAttribute("gifs", gifRepository.getAllGifs());
            return "home";
        }

        @GetMapping("/favorites")
        public String openFavorites(ModelMap modelMap){
            modelMap.addAttribute("favorites", gifRepository.allFavorites());
            return "favorites";
        }



        @GetMapping("/category")
        public String openCategory(){

            return "category";
        }

        @RequestMapping("/gif/{name}")
        public String gifDetails(@PathVariable String name, ModelMap modelMap) {
            modelMap.addAttribute("gif", gifRepository.findByName(name));
            return "gif-details";
        }

}
