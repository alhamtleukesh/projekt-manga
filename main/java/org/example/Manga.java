package org.example;

public class Manga {
    private String title;
    private String genres;

    public Manga() {
        title = "Default Title";
        genres = "Default Genres";
    }

    public Manga(String title, String genres) {
        this.title = title;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }
}
