package com.simran.job.jobserve.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.simran.job.jobserve.domain.Acceptor;

@Repository
public interface AcceptorRepository extends MongoRepository<Acceptor,Integer> {

}
