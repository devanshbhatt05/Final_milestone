package com.food.app.Services;


import com.food.app.Dao.AdminRepository;
import com.food.app.Enties.Admin;
import com.food.app.Enties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService{

    @Autowired
    private AdminRepository adminRepository;



    public String saveAdmin(Admin admin){
        adminRepository.save(admin);
        return "Admin Created";
    }



}
