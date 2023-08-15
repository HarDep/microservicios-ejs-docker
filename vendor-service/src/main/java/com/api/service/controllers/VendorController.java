package com.api.service.controllers;

import com.api.service.entities.Vendor;
import com.api.service.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;
    @GetMapping
    public ResponseEntity<List<Vendor>> getAll(){
        return ResponseEntity.ok(vendorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendor> getById(@PathVariable Integer id){
        return vendorService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return vendorService.delete(id) ? ResponseEntity.ok("Eliminado correctamente, id:" + id)
                : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Vendor> save(@RequestBody Vendor vendor){
        vendor.setId(null);
        return ResponseEntity.ok(vendorService.save(vendor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vendor> update(@PathVariable Integer id,@RequestBody Vendor vendor){
        return vendorService.exist(id)? ResponseEntity.ok(vendorService.save(vendor)) :
                ResponseEntity.notFound().build();
    }
}
