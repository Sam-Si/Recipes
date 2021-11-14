package recipes.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RecipeNotFoundException extends ResponseStatusException {
    public RecipeNotFoundException(HttpStatus status) {
        super(status);
    }
}