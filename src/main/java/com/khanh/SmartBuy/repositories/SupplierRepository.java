package com.khanh.SmartBuy.repositories;

import com.khanh.SmartBuy.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
