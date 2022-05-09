package codesquad.be.repository;

import static org.assertj.core.api.Assertions.assertThat;

import codesquad.be.domain.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class ProductRepositoryTest {

	@Autowired
	private ProductRepository repository;

	@Test
	void 프로덕트_데이터_저장_성공() {
		Product product = new Product();
		product.setName("김치찌개");

		Long saveId = repository.save(product);
		Product findProduct = repository.find(saveId);

		assertThat(product).isEqualTo(findProduct);
		assertThat(saveId).isEqualTo(1);
	}
}
