package com.springbootjpa.dao;

import com.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
