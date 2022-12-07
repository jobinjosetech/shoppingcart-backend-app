package com.example.ShoppingCartApp.dao;
import com.example.ShoppingCartApp.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}