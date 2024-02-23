package org.example;

import org.example.config.MangaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MangaConfig.class);

        Manga narutoManga = (Manga) context.getBean("NarutoManga");
        System.out.println(narutoManga);

        Manga onePieceManga = (Manga) context.getBean("OnePieceManga");
        System.out.println(onePieceManga);

        Author mangaAuthor = (Author) context.getBean("MangaAuthor");
        System.out.println(mangaAuthor);

        mangaAuthor.setManga(onePieceManga);
        System.out.println(mangaAuthor);

        context.close();
    }
}
