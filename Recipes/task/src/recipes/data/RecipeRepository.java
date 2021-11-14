package recipes.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.domain.RecipeEntity;


@Repository
public interface RecipeRepository extends CrudRepository<RecipeEntity, Long> {
}