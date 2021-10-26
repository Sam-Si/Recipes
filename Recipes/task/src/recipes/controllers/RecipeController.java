package recipes.controllers;

import recipes.models.Recipe;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    Recipe oneRecipe = new Recipe();

    @PostMapping("/api/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        oneRecipe = recipe;
    }

    @GetMapping("/api/recipe")
    public Recipe getOneRecipe() {
        return oneRecipe;
    }
}
