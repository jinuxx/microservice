package com.ssjwt.repository;

import com.ssjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author XuJin
 * @since 2018/12/28 20:39
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
