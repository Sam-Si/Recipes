package recipes.service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddRecipeRequest {
    @NotBlank
    private String name;
    @NotEmpty
    private List<@NotBlank String> ingredients;
    @NotEmpty
    private List<@NotBlank String> directions;
    @NotBlank
    private String description;
}