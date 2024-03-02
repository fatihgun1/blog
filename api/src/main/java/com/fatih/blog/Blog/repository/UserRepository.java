package com.fatih.blog.Blog.repository;

import com.fatih.blog.Blog.model.UserModel;
import com.fatih.blog.Blog.model.enumtype.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    Optional<UserModel> findByEmail(String email);
    UserModel findByRoles(RoleEnum roles);
}