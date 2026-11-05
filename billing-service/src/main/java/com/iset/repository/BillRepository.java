package com.iset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iset.entities.Bill;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long> {
}