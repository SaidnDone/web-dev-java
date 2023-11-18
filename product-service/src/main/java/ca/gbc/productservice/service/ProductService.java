package ca.gbc.productservice.service;

import ca.gbc.productservice.dto.ProductRequest;
import ca.gbc.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    public String updateProduct(String productid, ProductRequest productRequest);

    void deleteProduct(String productid);

    List<ProductResponse> getProducts();

}
