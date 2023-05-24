package com.food.app.Dao;

import com.food.app.Enties.ScheduleMeal;
import com.food.app.Enties.ScheduleMealRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleMealRepository extends JpaRepository<ScheduleMeal, Long> {
}
