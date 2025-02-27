package portail.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portail.entities.Product;

@Repository  // ✅ Ajoutez cette annotation si elle manque
public interface ProductRepository extends JpaRepository<Product, Long> {
}
