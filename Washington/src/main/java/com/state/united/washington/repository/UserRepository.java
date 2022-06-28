package com.state.united.washington.repository;

import entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    public UserEntity findByAddressAndEmailOrderBy(String address, String Email);
}
