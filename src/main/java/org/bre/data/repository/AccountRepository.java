package org.bre.data.repository;

import java.io.Serializable;
import java.util.List;

import org.bre.data.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, Serializable>{
	public List<Account> findByProfileLastName(String firstName);
}
