package com.amalvadkar.ihms.common.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "header_mapping")
@Getter
@Setter
public class HeaderMappingEntity extends AbstractIdBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "header_config_id")
    private HeaderConfigEntity headerConfigEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_menu_id")
    private RoleMenuEntity roleMenuEntity;

    private Boolean editable;
    private BigDecimal displayOrder;
    private Boolean isDefault;

}
