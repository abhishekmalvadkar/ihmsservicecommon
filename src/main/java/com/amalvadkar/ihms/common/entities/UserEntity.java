package com.amalvadkar.ihms.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity extends AbstractIdBaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "auth_provider")
    private String authProvider;

    @Column(name = "last_login_time")
    private Instant lastLoginTime;

    @Column(name = "photo_url")
    private String photoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id" , nullable = false)
    private RoleEntity roleEntity;


}
