package com.amalvadkar.ihms.common.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role_menu")
@Getter
@Setter
public class RoleMenuEntity extends AbstractIdBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private RoleEntity roleEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    private MenuEntity menuEntity;

}
