package com.amalvadkar.ihms.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "header_config")
@Getter
@Setter
public class HeaderConfigEntity extends AbstractIdBaseEntity {

    @Column(name = "header_name")
    private String headerName;

    @Column(name = "header_type", nullable = false)
    private String headerType;

    @Column(name = "mapping_name")
    private String mappingName;

    @Column(name = "mapping_column")
    private String mappingColumn;

    @Column(name = "mapping_table")
    private String mappingTable;

    @Column(name = "sort_by")
    private String sortBy;

    @Column(name = "sortable")
    private Boolean sortable;

    @Column(name = "confirm_need")
    private Boolean confirmNeed;

    @Column(name = "blankable")
    private Boolean blankable;
}
