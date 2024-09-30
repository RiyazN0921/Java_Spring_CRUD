
package com.example.springboot_mongodb_crud.repository;

import com.example.springboot_mongodb_crud.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User, String> {
}
