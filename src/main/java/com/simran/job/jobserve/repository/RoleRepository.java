/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simran.job.jobserve.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author didin
 */
public interface RoleRepository extends MongoRepository<com.simran.job.jobserve.domain.Role, String> {
    
    com.simran.job.jobserve.domain.Role findByRole(String role);
}
