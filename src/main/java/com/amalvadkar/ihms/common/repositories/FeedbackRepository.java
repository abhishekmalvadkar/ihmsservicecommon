package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface FeedbackRepository extends JpaRepository<FeedBackEntity, Long> {

    @Query("""
        SELECT fbe FROM FeedBackEntity fbe
        LEFT JOIN FETCH fbe.createdBy
        LEFT JOIN FETCH fbe.reviewedBy
        LEFT JOIN FETCH fbe.updatedBy  
        where fbe.id= :feedbackId 
        AND fbe.deleteFlag=false
        """)
    Optional<FeedBackEntity> findFeedbackByFeedbackId(@Param("feedbackId") Long feedbackId);

}

