package com.example.ShoppingCartApp.dao;

import com.example.ShoppingCartApp.model.ProductModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends CrudRepository<ProductModel, Integer> {
    @Query(value = "SELECT `id`, `category`, `description`, `image_url`, `price`, `title` FROM `product` WHERE `title` LIKE %:title%")
    List<ProductModel> SearchProduct(@Param("title") String title);
}
