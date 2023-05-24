package com.food.app.Controller;

import com.food.app.Dao.UserRepository;
import com.food.app.Enties.Login;
import com.food.app.Enties.LoginResonse;
import com.food.app.Services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/lpage")
@CrossOrigin("http://localhost:3000")
public class CheckController {

    @Autowired
    private UserRepository UserRepository;
    @Autowired
    private UserServiceImp UserService;



    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Login login){
        LoginResonse loginResonse= UserService.loginuser(login);
        return ResponseEntity.ok(loginResonse);
    }



}
