package com.client.autodatabasecreation.entity;


import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="client_master")
@Getter
@Setter
@Builder
public class ClientMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "office_based_capital_budgeting_master_seq_gen")
    @SequenceGenerator(name = "office_based_capital_budgeting_master_seq_gen", sequenceName = "office_based_capital_budgeting_master_seq", initialValue = 1, allocationSize = 1)
    private Integer id;

    @Column(name = "client_alias", nullable = false)
    private String clientAlias;

    @Column(name = "tenant_id", nullable = false)
    private String tenantId;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "client_name_loc_lang")
    private String clientNameLocLang;
}
