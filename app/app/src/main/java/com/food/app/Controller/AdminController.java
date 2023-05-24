package com.food.app.Controller;

import com.food.app.Dao.MenuRepository;
import com.food.app.Dao.NotificationRepository;
import com.food.app.Dao.UserRepository;
import com.food.app.Dao.VendorRepository;
import com.food.app.Enties.*;
import com.food.app.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;


    private final UserRepository userRepository;
    private  final VendorRepository vendorRepository;

    private  final MenuRepository menuRepository;

    private final NotificationRepository notificationRepository;

    public AdminController(UserRepository userRepository, VendorRepository vendorRepository, MenuRepository menuRepository, NotificationRepository notificationRepository) {
        this.userRepository = userRepository;
        this.vendorRepository = vendorRepository;
        this.menuRepository = menuRepository;
        this.notificationRepository = notificationRepository;
    }




    @PostMapping("/registerAdmin")
    public String saveAdmin(Admin admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/Vendors")
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    @GetMapping("/notifications")
    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }


    @PutMapping("/menus/{menuId}/approve")
    public ResponseEntity<String> approveMenu(@PathVariable Long menuId) {
        Optional<Menu> optionalMenu = menuRepository.findById(menuId);

        if (optionalMenu.isPresent()) {
            Menu menu = optionalMenu.get();
            menu.setApproved(true);
            menuRepository.save(menu);
            return ResponseEntity.ok("Menu approved successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
