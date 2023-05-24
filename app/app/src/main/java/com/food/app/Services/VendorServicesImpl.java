package com.food.app.Services;


import com.food.app.Dao.VendorRepository;
import com.food.app.Enties.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServicesImpl implements VendorServices{

    @Autowired
    private VendorRepository vendorRepository;
    public String saveVendor(Vendor vendor){
        vendorRepository.save(vendor);
        return "Vendor Created";
    }

}
