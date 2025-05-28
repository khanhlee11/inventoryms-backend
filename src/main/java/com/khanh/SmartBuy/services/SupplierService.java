package com.khanh.SmartBuy.services;

import com.khanh.SmartBuy.dtos.Response;
import com.khanh.SmartBuy.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}