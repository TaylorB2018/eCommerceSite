package taylor.project.ecommercebackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taylor.project.ecommercebackend.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
