package com.delivery.dao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.delivery.entities.Bill;

public interface IBillRepository extends JpaRepository<Bill,Integer> {
@Query("Select b from Bill b")
	Bill findOne(Bill bill);
@Query("Select sum(b.totalCost) from Bill b")
double findTotalCost(Bill bill);

@Query("Select b from Bill b")
List<Bill> viewBill(Bill bill);

@Query("Select b from Bill b where bill_date=?1")
List<Bill> findBills(LocalDateTime date);

}