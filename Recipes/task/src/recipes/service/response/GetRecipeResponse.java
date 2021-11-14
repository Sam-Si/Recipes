package recipes.service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRecipeResponse {
    private String name;
    private List<String> ingredients;
    private List<String> directions;
    private String description;
}