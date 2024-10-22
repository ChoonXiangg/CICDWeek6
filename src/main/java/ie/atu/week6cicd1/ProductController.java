package ie.atu.week6cicd1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Product> newProduct(@RequestBody Product product){
        list = myService.addProduct(product);
        //Send it to do business logic
        return list;
    }
}
