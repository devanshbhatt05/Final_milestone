package com.food.app.Controller;

import com.food.app.Dao.MenuRepository;
import com.food.app.Enties.Menu;
import com.food.app.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {


    @Autowired
    private MenuService menuService;




    @PostMapping("/createMenu")
    public Menu createMenu(@RequestBody Menu menu) {

        Menu createdMenu = menuService.createMenu(menu);
        return createdMenu;
    }
    @GetMapping("/getmenu")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }
}
