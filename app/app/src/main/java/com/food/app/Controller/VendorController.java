package com.food.app.Controller;

import com.food.app.Dao.MenuRepository;
import com.food.app.Dao.NotificationRepository;
import com.food.app.Enties.Menu;
import com.food.app.Enties.Notification;
import com.food.app.Enties.Vendor;
import com.food.app.Services.VendorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendors")
public class VendorController {

    @Autowired
    private VendorServices vendorServices;

    private final NotificationRepository notificationRepository;
    private  final MenuRepository menuRepository;

    public VendorController(NotificationRepository notificationRepository, MenuRepository menuRepository) {
        this.notificationRepository = notificationRepository;
        this.menuRepository = menuRepository;
    }


    @PostMapping("/registerVendor")
    public String saveVendor(Vendor vendor){
        return vendorServices.saveVendor(vendor);
    }

    @PostMapping("/menus")
    public Menu addMenu(@RequestBody Menu menu) {
        Menu savedMenu = menuRepository.save(menu);

        String message = "New menu added. Please approve: " + menu.getMenu_name();

        Notification notification = new Notification();
        notification.setMessage(message);
        notificationRepository.save(notification);

        return savedMenu;
    }

}
