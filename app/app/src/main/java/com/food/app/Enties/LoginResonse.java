package com.food.app.Enties;



public class LoginResonse {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private  String message;

    public LoginResonse() {
    }

    public LoginResonse(String message, String role) {
        this.message = message;
        this.role = role;
    }

    private String role;


}
