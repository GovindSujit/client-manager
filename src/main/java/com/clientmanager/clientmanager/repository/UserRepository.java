package com.clientmanager.clientmanager.repository;

import com.clientmanager.clientmanager.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<UserDetails, Long>{

}
