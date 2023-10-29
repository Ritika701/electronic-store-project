package com.electronic.store.repositories;

import com.electronic.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//JpaRepository - give features to perform db operations
//JpaRepository - implements PagingAndSortingRepository
//PagingAndSortingRepository - implements CrudRepository(for crud operations)

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
    List<User> findByNameContaining(String keyword);
}
