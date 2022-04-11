package com.baglie.CRUDProxyBandTest.Repository;

import com.baglie.CRUDProxyBandTest.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
