package com.example.buyopt.servise;

import models.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServise {
    private List<Products> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Products(++ID, "Toyota Estima 2 - ", "Simple description", 1500000, "Lipetsk", "diller"));
        products.add(new Products(++ID, "Toyota Estima 3 - ", "Simple description", 2000000, "Lipetsk", "diller"));
    }

    public List<Products> listProduct() {
        return products;
    }

    public void saveProducts(Products product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Products getProductById(Long id) {
        for (Products product : products) {
            if (product.getId().equals(id)) return product;
        }
            return null;



    }
}
