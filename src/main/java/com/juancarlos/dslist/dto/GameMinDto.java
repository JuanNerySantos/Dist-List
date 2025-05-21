package com.juancarlos.dslist.dto;

import com.juancarlos.dslist.entities.Games;
import jakarta.persistence.Column;

public class GameMinDto {
    private long id;
    private String title;
    private Integer year;
    private Double score;
    private String imgUrl;

    public GameMinDto(){}

    public GameMinDto(Games entity){
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getScore() {
        return score;
    }
}
