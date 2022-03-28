package com.netflix.movie.controller;

import com.netflix.movie.model.Netflix;
import com.netflix.movie.repository.NetflixRepository;

import java.util.Collections;
import java.util.List;

public class NetflixController {

    NetflixRepository netflixRepository = new NetflixRepository();


    public void searchMovieByName(List<Netflix> list, String name){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getTitle().contains(name)){
                System.out.println(list.get(i));
            }
        }
    }

    public void searchMovieByCategory(List<Netflix> list, String cate){
        for (int i = 0; i < list.size(); i++ ){
            if(list.get(i).getCategory().contains(cate)){
                System.out.println(list.get(i));
            }

        }

    }

    public void searchMovieByLanguage(List<Netflix> list, String language){
        for (int i = 0; i < list.size(); i++ ){
            if(list.get(i).getLanguage().contains(language)){
                System.out.println(list.get(i));
            }

        }

    }

    public void countMovieByTime(){
        System.out.println("Phim sau khi sort theo thoi gian");


    }


}
