package codesquad.be.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Product {

	@Id @GeneratedValue
	private Long id;

	private String name;

	private String description;

	private int price;

	private int stock;
}
