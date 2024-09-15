package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.HeaderMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeaderMappingRepository extends JpaRepository<HeaderMappingEntity, Long> {

    @Query("""
            SELECT hm FROM HeaderMappingEntity hm
            JOIN FETCH hm.headerConfigEntity hc
            JOIN hm.roleMenuEntity rm
            WHERE rm.roleEntity.id = :roleId
            AND rm.menuEntity.id = :menuId
            AND hc.deleteFlag = false
            AND hm.deleteFlag = false
            AND rm.deleteFlag = false
            AND rm.roleEntity.deleteFlag = false
            AND rm.menuEntity.deleteFlag = false
            ORDER BY hm.displayOrder ASC
            """)
    List<HeaderMappingEntity> findHeadersBasedOnRoleMenu(@Param("roleId") Long roleId,
                                                         @Param("menuId") Long menuId);

}
