package com.nilendu.neueda.repository;


import com.nilendu.neueda.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<Stocks, Long> {

}
