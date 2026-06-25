package com.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.busbooking.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}