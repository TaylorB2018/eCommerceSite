package taylor.project.ecommercebackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import taylor.project.ecommercebackend.entity.ProductCategory;

// collectionResourceRel is the name of the JSON entry and path is the path "/product-category"
@Repository
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
