package com.jmoney.StickyTapeAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmoney.StickyTapeAPI.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
	List<Movie> findByTitle(String title);

}
