package ca.gbc.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document(value = "product")
@Data //Getters and setters for all attributes
@AllArgsConstructor //Makes constructor taking in all arguments
@NoArgsConstructor //Makes constructor taking in no arguments
@Builder            //Instantiates objects

public class Product {

    @Id
    private String id;

    private String name;
    private String description;
    private BigDecimal price;

}
