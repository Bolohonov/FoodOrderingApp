package dev.bolohonov.kafkaconsumer.repository;

import dev.bolohonov.kafkaconsumer.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
}
