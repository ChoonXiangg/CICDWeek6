package ie.atu.week6cicd1;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Positive(message = "This value must be positive")
    private int id;
    @NotNull(message = "This value must not be null")
    private String name;
    @Positive(message = "This value must be positive")
    private double price;
}
