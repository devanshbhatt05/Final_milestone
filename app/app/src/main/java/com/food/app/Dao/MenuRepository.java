package com.food.app.Dao;

import com.food.app.Enties.Menu;
import com.food.app.Enties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}