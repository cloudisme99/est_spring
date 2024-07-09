package com.example.basic.day240701.practice4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.email = ?1 and u.age = ?2")
	User findByEmailAndAge(String email, int age);

	@Query("select (count(u) > 0) from User u where u.email = ?1")
	boolean existsByEmail(String email);
}