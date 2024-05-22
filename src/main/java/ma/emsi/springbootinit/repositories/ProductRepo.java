package ma.emsi.springbootinit.repositories;

import ma.emsi.springbootinit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findByName(String name);
    Product findByRef(String ref);
    Product deleteByName(String name);
    List<Product> findByNameContaining(String term);
}
