package com.guitar.db.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Model;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, Long> {
	
	List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal bigDecimal, BigDecimal bigDecimal2);

}
