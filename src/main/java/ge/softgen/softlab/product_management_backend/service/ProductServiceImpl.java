package ge.softgen.softlab.product_management_backend.service;

import ge.softgen.softlab.product_management_backend.model.Product;
import ge.softgen.softlab.product_management_backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productRepo.findById(id).get();

        if (product != null) {
            productRepo.delete(product);
            return "Product Delete Successfully";
        }

        return "Something wrong on server";
    }

    @Override
    public Product editProduct(Product p, Integer id) {

        Product oldProduct = productRepo.findById(id).get();

        oldProduct.setProductName(p.getProductName());
        oldProduct.setDescription(p.getDescription());
        oldProduct.setPrice(p.getPrice());
        oldProduct.setStatus(p.getStatus());

        return productRepo.save(oldProduct);
    }
}
