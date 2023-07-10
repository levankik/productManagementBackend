package ge.softgen.softlab.product_management_backend.repository;

import ge.softgen.softlab.product_management_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {
}
