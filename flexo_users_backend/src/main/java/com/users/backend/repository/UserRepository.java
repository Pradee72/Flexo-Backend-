package com.users.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.backend.dao.UserDao;

@Repository
public interface UserRepository extends JpaRepository<UserDao, String>{

}
