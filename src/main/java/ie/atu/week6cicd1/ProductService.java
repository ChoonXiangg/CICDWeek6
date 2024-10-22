package ie.atu.week6cicd1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product){
        //Do business stuff like retrieving details from db, or generating files pdfs
        myList.add(product);
        return myList;
    }
    public List<Product> updateProduct(Product product, int id){
        for(Product p : myList){
            if(p.getId() == id){
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }
    public List<Product> deleteProduct(int id){
        for(Product p : myList){
            if(p.getId() == id){
                myList.remove(p);
            }
        }
        return myList;
    }
}
