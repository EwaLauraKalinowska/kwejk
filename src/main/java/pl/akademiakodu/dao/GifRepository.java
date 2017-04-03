package pl.akademiakodu.dao;

import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Gif;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ewcia on 03.04.17.
 */
@Component
public class GifRepository {


    private static final List<Gif> ALL_GIFS= Arrays.asList(
            new  Gif("android-explosion", "Ada Lovelace", true, 1),
            new  Gif("ben-and-mike", "Miś", false, 3),
            new  Gif("book-dominos", "Matejka", false, 3),
            new  Gif("compiler-bot", "Klik Klak", false, 2),
            new  Gif("cowboy-coder", "Coś Smoś", false, 2),
            new  Gif("infinite-andrew", "Masełko", true, 2)
    );
    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName (String name){
        for(Gif gif: ALL_GIFS){
            if(gif.getName().equals(name)){
                return gif;
            }
        }
        return  null;
    }

    public List<Gif> allFavorites(){
        List<Gif> list= new LinkedList<>();
        for(Gif gif: ALL_GIFS){
            if(gif.isFavorite()==true){
                list.add(gif);
            }
        }
        return list;
    }
    public List<Gif> findById (Integer id){
        List<Gif> gifs= new LinkedList<>();
        for(Gif gif: ALL_GIFS){
            if(gif.getCategoryId()==id){
                gifs.add(gif);
            }
        }
        return gifs;


    }

}
