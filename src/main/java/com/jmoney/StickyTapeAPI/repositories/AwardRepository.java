package com.jmoney.StickyTapeAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmoney.StickyTapeAPI.models.Award;

@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {
  List<Award> findByTitle(String title);

}