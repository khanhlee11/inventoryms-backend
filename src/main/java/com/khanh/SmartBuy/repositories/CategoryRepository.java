package com.khanh.SmartBuy.repositories;

import com.khanh.SmartBuy.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
