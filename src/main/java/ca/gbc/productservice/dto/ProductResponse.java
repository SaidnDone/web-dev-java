package ca.gbc.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data //Getters and setters for all attributes
@AllArgsConstructor //Makes constructor taking in all arguments
@NoArgsConstructor //Makes constructor taking in no arguments
@Builder
public class ProductResponse {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
