package com.pocket.linguist.server.service;


import com.pocket.linguist.server.entity.UserProfile;
import com.pocket.linguist.server.repository.AuthorizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceIml implements AuthorizationService {

    @Autowired
    private AuthorizationRepository authorizationRepository;

    @Override
    public UserProfile getUserProfile() {
        return getUserProfile();
    }

    @Override
    public UserProfile getUserProfileById(long userId) {
        return authorizationRepository.findOne(userId);
    }
}
