package com.amalvadkar.ihms.common.models.dto;

import java.time.Instant;

public record FetchFilesContentDTO(Long fileId, String fileName, String uploadedBy, Instant uploadedOn) {
}
