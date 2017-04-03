package pl.akademiakodu.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Category;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ewcia on 03.04.17.
 */
@Component
public class CategoryRepository {
    private  static final List<Category> ALL_CATEGORIES= Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "if"),
            new Category(3, "frog")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
    public Category findById(int id){
        for(Category category:ALL_CATEGORIES){
            if(category.getId()==id){
                return category;
            }
        }return null;
    }
}
