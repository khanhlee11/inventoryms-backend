package com.khanh.SmartBuy.repositories;

import com.khanh.SmartBuy.models.Category;
import com.khanh.SmartBuy.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {
}
