package com.example.buyopt.servise;

import com.example.buyopt.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import models.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServise {
    private final ProductRepository productRepository;

    public List<Products> listProduct(String title) {
        List<Products> products = productRepository.findAll();
        if(title != null) return productRepository.findByTitle(title);//если есть title, то мы его возращаем
        return productRepository.findAll();//если нет, то возращаем всё что есть

    }

    public void saveProducts(Products product) {
        log.info("Saving new {} ", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id); // удаление товара
    }

    public Products getProductById(Long id) {
        return productRepository.findById(id).orElse(null);// елси товар не найден то возращаем null (проверка на наличе товара)
    }
}


