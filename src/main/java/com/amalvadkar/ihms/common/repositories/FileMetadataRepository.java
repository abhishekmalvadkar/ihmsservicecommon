package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.FileMetadataEntity;
import com.amalvadkar.ihms.common.models.dto.FetchFilesContentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FileMetadataRepository extends JpaRepository<FileMetadataEntity, String> {
    Optional<FileMetadataEntity> findByIdAndDeleteFlagIsFalse(String fileId);

    @Query("""
        SELECT
            new com.amalvadkar.ihms.common.models.dto.FetchFilesContentDTO
            (
                fe.id,
                fe.fileName,
                u.name,
                fe.createdOn
            )
        FROM FileMetadataEntity fe
        JOIN fe.createdBy u
        WHERE fe.recordId = :recordId
        AND fe.deleteFlag = false
        """)
    List<FetchFilesContentDTO> findFilesMetadataByRecordId(@Param("recordId") String recordId);

    List<FileMetadataEntity> findAllByRecordId(String recordId);
}


