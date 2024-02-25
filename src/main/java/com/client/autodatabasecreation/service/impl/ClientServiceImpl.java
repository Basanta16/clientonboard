package com.client.autodatabasecreation.service.impl;

import com.client.autodatabasecreation.databasemanager.DatabaseManager;
import com.client.autodatabasecreation.entity.ClientMaster;
import com.client.autodatabasecreation.pojo.ClientRequestPojo;
import com.client.autodatabasecreation.repo.ClientMasterRepo;
import com.client.autodatabasecreation.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientMasterRepo clientMasterRepo;
    private final DatabaseManager databaseManager;

    @Override
    public Integer addClient(ClientRequestPojo clientRequestPojo) {
        ClientMaster clientMaster = ClientMaster.builder()
                .clientAlias(clientRequestPojo.getClientAlias())
                .clientName(clientRequestPojo.getClientName())
                .tenantId(clientRequestPojo.getTenantId()).build();
        clientMasterRepo.save(clientMaster);
        try {
            databaseManager.createDatabaseForClient(clientMaster.getClientName());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
