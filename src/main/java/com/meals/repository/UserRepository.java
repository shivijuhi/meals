package com.meals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meals.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
