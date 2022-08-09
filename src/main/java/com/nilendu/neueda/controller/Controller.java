package com.nilendu.neueda.controller;


//import com.nilendu.neueda.exception.ResourceNotFoundException;
import com.nilendu.neueda.model.Stocks;
import com.nilendu.neueda.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    StockRepo stockRepo;

    // Get All stocks
    @GetMapping("/stocks/all")
    public List<Stocks> getAllStocks() { 
    	List<Stocks> stocksAll = stockRepo.findAll();
        return stockRepo.findAll();
    }
    
    @GetMapping("/stocks/{name}")
    public List<Stocks> getStock(@PathVariable(value = "name") String name) { 
    	List<Stocks> stocksAll = stockRepo.findAll();
    	
        return stockRepo.findAll();
    }

    // Create a new Note
    @PostMapping("/stocks")
    public Stocks enterStock(@Valid @RequestBody Stocks stock) {
    	System.out.println("Post Triggered...."+ Double.toString(stock.getTotalPrice()));
        return stockRepo.save(stock);
    }
    
}
