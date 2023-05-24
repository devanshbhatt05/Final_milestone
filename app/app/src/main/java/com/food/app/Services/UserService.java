package com.food.app.Services;

import com.food.app.Enties.Login;
import com.food.app.Enties.LoginResonse;
import com.food.app.Enties.User;

public interface UserService {


    String saveUser(User user);
    LoginResonse loginuser( Login login);
}
