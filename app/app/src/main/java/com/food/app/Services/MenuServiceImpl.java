package com.food.app.Services;

import com.food.app.Dao.MenuRepository;
import com.food.app.Enties.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements  MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }


    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}
