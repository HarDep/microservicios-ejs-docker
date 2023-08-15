package com.api.service.services;

import com.api.service.entities.Vendor;
import com.api.service.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorServiceImpl implements VendorService{

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public List<Vendor> getAll(){
        return (List<Vendor>) vendorRepository.findAll();
    }

    @Override
    public Optional<Vendor> getById(Integer id) {
        return vendorRepository.findById(id);
    }

    @Override
    public Vendor save(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public boolean delete(Integer id) {
        if (vendorRepository.existsById(id)){
            vendorRepository.deleteById(id);
            return true;
        }else
            return false;
    }

    @Override
    public boolean exist(Integer id) {
        return vendorRepository.existsById(id);
    }
}
