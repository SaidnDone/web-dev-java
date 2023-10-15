package ca.gbc.productservice.controller;

import ca.gbc.productservice.dto.ProductRequest;
import ca.gbc.productservice.dto.ProductResponse;
import ca.gbc.productservice.service.ProductServiceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceimpl productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);

    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts(){
        return productService.getProducts();

    }
    @PutMapping({"/{productid}"})
    public ResponseEntity<?> updateProduct(@PathVariable("productid") String productid,
                                            @RequestBody ProductRequest productRequest){
        String updatedProductId = productService.updateProduct(productid, productRequest);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/product/" +updatedProductId);

        return new ResponseEntity<>(headers,HttpStatus.NO_CONTENT);
    }
@DeleteMapping("/{productid}")
    public ResponseEntity<?> deleteProduct(@PathVariable("productid") String productid){
        productService.deleteProduct(productid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}
