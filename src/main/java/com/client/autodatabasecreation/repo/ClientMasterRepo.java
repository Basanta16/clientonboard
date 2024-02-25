package com.client.autodatabasecreation.repo;

import com.client.autodatabasecreation.entity.ClientMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientMasterRepo extends JpaRepository<ClientMaster, Integer> {
}
