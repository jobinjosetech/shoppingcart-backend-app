package com.example.ShoppingCartApp.dao;
import com.example.ShoppingCartApp.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {
    @Query(value = "SELECT `id`, `address`, `email`, `name`, `password`, `phone`, `username` FROM `user` WHERE `username`= :username", nativeQuery = true)
    List<UserModel> FindUserLogin(@Param("username") String username);
}