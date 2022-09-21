package com.clientmanager.clientmanager.repository;

import com.clientmanager.clientmanager.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

    public boolean existsByUserName(String userName);

}