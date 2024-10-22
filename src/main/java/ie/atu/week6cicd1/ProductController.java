package ie.atu.week6cicd1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList();

    //Creating a class which is interested in requests and responses. Separation of Concern
    @PostMapping
    public List<Product> newProduct(@Valid @RequestBody Product product) {
        list = myService.addProduct(product);
        //Send it to do business logic
        return list;
    }

    @PutMapping("/{id}")
    public List<Product> updateProduct(@Valid @RequestBody Product product, @PathVariable int id) {
        list = myService.updateProduct(product, id);
        return list;
    }

    @DeleteMapping("/{id}")
    public List<Product> deleteProduct(@Valid @PathVariable int id) {
        list = myService.deleteProduct(id);
        return list;
    }
}
