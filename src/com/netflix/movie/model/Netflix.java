package com.netflix.movie.model;

public class Netflix {
    private long id;
    private String title;
    private String category;
    private String actor;
    private String language;
    private String publish_year;
    private String publish_company;
    private int time;

    public Netflix(long id, String title, String category, String actor, String language, String publish_year, String publish_company, int time) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.actor = actor;
        this.language = language;
        this.publish_year = publish_year;
        this.publish_company = publish_company;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(String publish_year) {
        this.publish_year = publish_year;
    }

    public String getPublish_company() {
        return publish_company;
    }

    public void setPublish_company(String publish_company) {
        this.publish_company = publish_company;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return id +" - "+ title + " - " + category + " - " + time + " - " + language;
    }
}
