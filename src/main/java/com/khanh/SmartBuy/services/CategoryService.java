package com.khanh.SmartBuy.services;

import com.khanh.SmartBuy.dtos.CategoryDTO;
import com.khanh.SmartBuy.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}