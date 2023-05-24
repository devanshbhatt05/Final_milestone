package com.food.app.Services;

import com.food.app.Dao.UserRepository;
import com.food.app.Enties.Login;
import com.food.app.Enties.LoginResonse;
import com.food.app.Enties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;
    public String saveUser(User user){
        userRepository.save(user);
        return "user saved";
    }


    public LoginResonse loginuser(Login login) {
        String msg = "";
        User employee1 = userRepository.findByUsername(login.getUsername());
        if (employee1 != null) {
            String password = login.getPassword();
            String dbpass = employee1.getPassword();
            if (password.equals(dbpass)) {
                Optional<User> employee = userRepository.findOneByUsernameAndPassword(login.getUsername(), dbpass);
                if (employee.isPresent()) {
                    return new LoginResonse("Login Success", employee1.getRole());
                } else {
                    return new LoginResonse("Login Failed", "");
                }
            } else {

                return new LoginResonse("password Not Match", "");
            }
        }else {
            return new LoginResonse("Email not exits", "");
        }
}}
