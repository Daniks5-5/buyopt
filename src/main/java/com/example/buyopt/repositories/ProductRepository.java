package com.example.buyopt.repositories;

import models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends JpaRepository<Products, Long> {

    List<Products> findByTitle(String title);


}
