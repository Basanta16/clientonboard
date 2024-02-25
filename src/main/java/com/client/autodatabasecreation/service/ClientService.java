package com.client.autodatabasecreation.service;

import com.client.autodatabasecreation.entity.ClientMaster;
import com.client.autodatabasecreation.pojo.ClientRequestPojo;

public interface ClientService {

    Integer addClient (ClientRequestPojo clientRequestPojo);
}
