package com.pocket.linguist.server.controller;


import com.pocket.linguist.server.entity.UserProfile;
import com.pocket.linguist.server.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocketLinguistController {

    @Autowired
    AuthorizationService authService;


    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public UserProfile getUserProfile() {
        UserProfile profileFromDb = authService.getUserProfileById(1);
        UserProfile testUserProfile = new UserProfile(
            "Test user name",
            "Test user password",
            "Test user login");
        return profileFromDb;
    }
}
