package org.example.config;

import org.example.Author;
import org.example.Manga;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MangaConfig {

    @Bean(value = "NarutoManga")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Manga createNarutoManga() {
        return new Manga("Naruto", "Action, Adventure");
    }

    @Bean(name = "OnePieceManga")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Manga createOnePieceManga() {
        return new Manga("One Piece", "Adventure, Fantasy");
    }

    @Bean("MangaAuthor")
    Author createMangaAuthor() {
        return new Author(
                "Mangaka",
                30,
                "Action, Adventure",
                createNarutoManga()
        );
    }
}
