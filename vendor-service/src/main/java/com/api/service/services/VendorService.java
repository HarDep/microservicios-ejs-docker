package com.api.service.services;

import com.api.service.entities.Vendor;

import java.util.List;
import java.util.Optional;

public interface VendorService {
    List<Vendor> getAll();
    Optional<Vendor> getById(Integer id);
    Vendor save(Vendor vendor);
    boolean delete(Integer id);
    boolean exist(Integer id);
}
