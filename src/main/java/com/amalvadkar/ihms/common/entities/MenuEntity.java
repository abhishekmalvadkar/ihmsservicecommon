package com.amalvadkar.ihms.common.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "menu")
@Getter
@Setter
public class MenuEntity extends AbstractIdBaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name="route")
    private String route;

    @Column(name="description")
    private String description;

    @Column(name="device")
    private String device;

    @Column(name="menu_order")
    private BigDecimal menuOrder;

    @Column(name="parent_id", nullable = false)
    private Long parentId;

}
