package com.mh.restapi03.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // findAll(), save(), deletefyId()

//    select * from user where email = ?; 만들어짐
    public User findByEmail(String email);
}
