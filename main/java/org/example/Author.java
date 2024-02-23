package org.example;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private int age;
    private String genres;
    private Manga manga;
    private List<Manga> mangas = new ArrayList<>();

    public Author() {
    }

    public Author(String name, int age, String genres, Manga manga) {
        this.name = name;
        this.age = age;
        this.genres = genres;
        setManga(manga);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
        mangas.add(manga);
    }

    public List<Manga> getMangas() {
        return mangas;
    }

    public void setMangas(List<Manga> mangas) {
        this.mangas = mangas;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", genres='" + genres + '\'' +
                ", \n  current Manga = " + manga +
                ", \n    other mangas = " + mangas +
                '}';
    }
}
