package pl.akademiakodu.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ewcia on 31.03.17.
 */
public class Gif {
    private String name;
   private String surname;
   private boolean favorite;
   private int categoryId;

    public Gif(String name, String surname, boolean favorite, int categoryId) {
        this.name = name;
        this.surname = surname;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public Gif(String name, String surname, boolean favorite) {
        this.name = name;
        this.surname = surname;
        this.favorite = favorite;
    }

    public Gif() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
