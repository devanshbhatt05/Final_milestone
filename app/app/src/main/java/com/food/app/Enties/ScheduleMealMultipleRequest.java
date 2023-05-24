package com.food.app.Enties;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



public class ScheduleMealMultipleRequest extends ScheduleMealRequest {
    private List<Long> vendorIds;
    // Other properties, getters, and setters

    public List<Long> getVendorIds() {
        return vendorIds;
    }

    public void setVendorIds(List<Long> vendorIds) {
        this.vendorIds = vendorIds;
    }
}






