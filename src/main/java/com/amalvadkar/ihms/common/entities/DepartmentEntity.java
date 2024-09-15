package com.amalvadkar.ihms.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "department")
@Getter
@Setter
public class DepartmentEntity extends AbstractIdBaseEntity  {

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="code", nullable = false)
    private String code;

    @Column(name="description")
    private String description;


}
