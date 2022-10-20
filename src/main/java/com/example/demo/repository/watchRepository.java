package com.example.demo.repository;
import java.util.List;

import com.example.demo.model.watches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface watchRepository extends JpaRepository<watches,Integer> {
	watches findByWatchName(String watchName);
	@Query(value="select * from watch where watch_price < ?1",nativeQuery=true)
	List<watches> findByWatchPrice(int watchPrice);
}