package recipes.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import recipes.service.RecipeService;

@Configuration
public class RecipeConfiguration {

    @Bean
    public RecipeService recipeService() {
        return new RecipeService();
    }
}