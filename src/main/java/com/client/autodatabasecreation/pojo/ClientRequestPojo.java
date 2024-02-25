package com.client.autodatabasecreation.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRequestPojo {

    private Integer id;
    private String clientName;
    private String clientAlias;
    private String tenantId;
}
