package com.client.autodatabasecreation.repo;

import com.client.autodatabasecreation.entity.DataSourceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSourceConfigRepo extends JpaRepository<DataSourceConfig, Integer> {

}
