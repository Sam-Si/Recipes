package recipes.controllers;

import recipes.models.Recipe;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    Recipe oneRecipe = new Recipe();

    @RequestMapping("/hello")
    public String hello() {
        return "hi";
    }

    @PostMapping("/api/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        oneRecipe = recipe;
    }

    @GetMapping("/api/recipe")
    public Recipe getOneRecipe() {
        return oneRecipe;
    }
}
