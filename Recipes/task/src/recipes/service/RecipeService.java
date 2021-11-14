package recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import recipes.domain.RecipeEntity;
import recipes.data.RecipeRepository;
import recipes.service.exception.RecipeNotFoundException;

public class RecipeService {

    @Autowired
    private RecipeRepository repo;

    public Long addRecipe(RecipeEntity recipe) {
        return repo.save(recipe).getId();
    }

    public RecipeEntity getRecipe(Long id) {
        return repo.findById(id).orElseThrow(() -> new RecipeNotFoundException(HttpStatus.NOT_FOUND));
    }

    public void deleteRecipe(Long id) {
        if (!repo.existsById(id)) {
            throw new RecipeNotFoundException(HttpStatus.NOT_FOUND);
        }
        repo.deleteById(id);
    }
}