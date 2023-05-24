package com.food.app.Services;

import com.food.app.Enties.Menu;

import java.util.List;

public interface MenuService {


    Menu createMenu(Menu menu);

    List<Menu> getAllMenus();
}
