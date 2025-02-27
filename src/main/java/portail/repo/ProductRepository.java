package portail.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import portail.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}