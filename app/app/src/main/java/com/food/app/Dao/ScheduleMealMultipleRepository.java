package com.food.app.Dao;

import com.food.app.Enties.ScheduleMeal;
import com.food.app.Enties.ScheduleMealMultiple;
import com.food.app.Enties.ScheduleMealMultipleRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleMealMultipleRepository extends JpaRepository<ScheduleMealMultiple, Long> {
}
