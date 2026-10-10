package com.voxHub.baithak.repository;

import com.voxHub.baithak.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
