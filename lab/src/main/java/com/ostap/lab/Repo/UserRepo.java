package com.ostap.lab.Repo;

import com.ostap.lab.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
