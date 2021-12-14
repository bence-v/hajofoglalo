package com.hajofoglalo.repositories;

import com.hajofoglalo.model.UserStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatusRepository extends CrudRepository<UserStatus, Integer> {
}
