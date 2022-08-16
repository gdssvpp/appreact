package com.gdssvpp.appreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdssvpp.appreact.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	/*
	 * @Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC"
	 * ) Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
	 */
}
