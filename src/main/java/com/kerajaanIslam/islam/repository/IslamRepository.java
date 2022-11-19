package com.kerajaanIslam.islam.repository;

import com.kerajaanIslam.islam.model.Kerajaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IslamRepository extends JpaRepository<Kerajaan, Long> {
}
