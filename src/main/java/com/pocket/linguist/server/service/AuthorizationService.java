package com.pocket.linguist.server.service;


import com.pocket.linguist.server.entity.UserProfile;

/**
 * Service provide auth and operation on user profile
 */
public interface AuthorizationService {

    UserProfile getUserProfile();
    UserProfile getUserProfileById(long userId);
}
