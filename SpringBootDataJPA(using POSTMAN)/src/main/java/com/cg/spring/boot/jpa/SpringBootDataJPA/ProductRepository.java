package com.cg.spring.boot.jpa.SpringBootDataJPA;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,String> {

}
