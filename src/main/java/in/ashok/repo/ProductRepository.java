package in.ashok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashok.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
