package recipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import recipes.domain.RecipeEntity;
import recipes.service.RecipeService;
import recipes.service.request.AddRecipeRequest;
import recipes.service.response.AddRecipeResponse;
import recipes.service.response.GetRecipeResponse;

import javax.validation.Valid;

@RestController
public class RecipeController {
    @Autowired
    private RecipeService service;

    @PostMapping("/api/recipe/new")
    public AddRecipeResponse addRecipe(@Valid @RequestBody AddRecipeRequest request) {
        System.out.println(request.toString());
        return new AddRecipeResponse().builder()
                .id(service.addRecipe(new RecipeEntity().builder()
                        .name(request.getName())
                        .description(request.getDescription())
                        .ingredients(request.getIngredients()).directions(request.getDirections())
                        .build()))
                .build();
    }

    @GetMapping("/api/recipe/{id}")
    public GetRecipeResponse getRecipe(@PathVariable Long id) {
        RecipeEntity recipe = service.getRecipe(id);
        return new GetRecipeResponse().builder()
                .name(recipe.getName())
                .description(recipe.getDescription())
                .ingredients(recipe.getIngredients())
                .directions(recipe.getDirections())
                .build();
    }

    @DeleteMapping("api/recipe/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteRecipe(@PathVariable Long id) {
        service.deleteRecipe(id);
    }
}