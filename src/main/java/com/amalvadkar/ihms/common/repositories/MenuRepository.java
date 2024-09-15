package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {


    @Query("""
            SELECT m FROM MenuEntity m
            WHERE m.code = :menuCode
            AND m.deleteFlag = false
            """)
    Optional<MenuEntity> findActiveMenu(@Param("menuCode") String menuCode);

}
