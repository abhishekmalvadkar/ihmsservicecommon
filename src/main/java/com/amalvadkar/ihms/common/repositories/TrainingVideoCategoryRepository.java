package com.amalvadkar.ihms.common.repositories;

import com.amalvadkar.ihms.common.entities.TrainingVideoCategory;
import com.amalvadkar.ihms.common.models.dto.KeyValueResponseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainingVideoCategoryRepository extends JpaRepository<TrainingVideoCategory,String> {


    @Query(value = """
          select t.id as key,t.name as value from training_video_category as t where delete_flag=false;
            """,nativeQuery = true)
    List<KeyValueResponseModel> findAllVideoCategories();

}
