package pl.akademiakodu.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.dao.CategoryRepository;
import pl.akademiakodu.dao.GifRepository;
import pl.akademiakodu.model.Category;

/**
 * Created by ewcia on 03.04.17.
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String listCategories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryRepository.getAllCategories());
                return "categories";
    }

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/category/{categoryId}")
    public String category(@PathVariable int categoryId, ModelMap modelMap){
        Category category=categoryRepository.findById(categoryId);
        modelMap.addAttribute("category", category);
        modelMap.addAttribute("gifs", gifRepository.findById(categoryId));
        return "category";
    }

}
