package ge.softgen.softlab.product_management_backend.service;

import ge.softgen.softlab.product_management_backend.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public Product saveProduct (Product product);

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);

    public String deleteProduct(Integer id);

    public Product editProduct(Product product, Integer id);
}
