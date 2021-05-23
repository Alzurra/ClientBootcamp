package com.thiagocostafatec.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagocostafatec.client.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
