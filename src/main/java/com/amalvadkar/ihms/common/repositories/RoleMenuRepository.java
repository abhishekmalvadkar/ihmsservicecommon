package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.RoleMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoleMenuRepository extends JpaRepository<RoleMenuEntity,Long> {

    @Query("""
            select rm from RoleMenuEntity rm
            JOIN FETCH rm.roleEntity r
            JOIN FETCH rm.menuEntity m
            where r.id = :roleId
            and rm.deleteFlag = false
            and r.deleteFlag = false
            and m.deleteFlag = false
            """)
    List<RoleMenuEntity> findRoleMenuBasedByRoleId(@Param("roleId") Long roleId);

    @Query("""
            select rm from RoleMenuEntity rm
            JOIN FETCH rm.menuEntity m
            JOIN FETCH rm.roleEntity r
            where m.id = :menuId
            and r.id = :roleId
            and rm.deleteFlag = false
            and m.deleteFlag = false
            and r.deleteFlag = false
            """)
    Optional<RoleMenuEntity> findByRoleIdAndMenuId(@Param("menuId") Long menuId,
                                                    @Param("roleId") Long roleId);
}
