package com.example.demo.repository;

import com.example.demo.entity.User;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Transactional
    @Modifying
    @Query("delete from User e where e.userId=:x")
    public void deleteEmploye(@Param("x") Integer userId); 
}
