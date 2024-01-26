package com.dmdev.service;

import com.dmdev.service.service.UserService;

public class Main {
    public static void main(String[] args) {

        new UserService().getUser(1L);
        System.out.println("Hello world!");
    }
}