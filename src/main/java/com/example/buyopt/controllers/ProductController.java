package com.example.buyopt.controllers;

import models.Products;
import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import com.example.buyopt.servise.ProductServise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ProductController { //главная страница сайта где будут выводиться все товары
    private final ProductServise productServise;





    @GetMapping("/")// слеш означает, что переходя на хост будет вызываться этот метод
    public String products(@RequestParam(name = "title", required = false)String title, Model model){//вернет весь спиосек еслит нет title или отсортированный
        model.addAttribute("products", productServise.listProduct(title));// передаём список всех товаров в шаблонизатор(products.ftlh)
        return "products";
    }

    @GetMapping("/product/{id}")
    public  String productInfo(@PathVariable Long id, Model model){//модель чтобы передавать данные текущего товара
        model.addAttribute("product",productServise.getProductById(id));// отобразили в продукт в моделе и отображем в его в product-info.ftlh
        return "product-info";
    }


    @PostMapping("/product/create")//логика добавления товара
    public String createProduct(Products product){
        productServise.saveProducts(product);
        return "redirect:/";

    }
    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){//с помощью @PathVariable id будет приходит в тип Long
    productServise.deleteProduct(id);
    return "redirect:/"; // редирект на главную страницу
    }
}
