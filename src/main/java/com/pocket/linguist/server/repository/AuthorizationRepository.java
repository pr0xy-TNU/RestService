package com.pocket.linguist.server.repository;

import com.pocket.linguist.server.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository provide basic CRUD operations.
 */
public interface AuthorizationRepository extends JpaRepository<UserProfile, Long> {

}
