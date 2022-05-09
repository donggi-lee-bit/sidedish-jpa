package codesquad.be.repository;

import codesquad.be.domain.Product;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

	private final EntityManager entityManager;
	public Long save(Product product) {
		entityManager.persist(product);
		return product.getId();
	}

	public Product find(Long id) {
		return entityManager.find(Product.class, id);
	}
}
