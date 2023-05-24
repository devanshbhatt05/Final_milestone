package com.food.app.Enties;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class ScheduleMealRequest {



    private Long vendorId;
    private LocalDateTime scheduledTime;

    public Object getVendorId() {
        return vendorId;
    }

    public Object getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Object scheduledTime) {

        this.scheduledTime= (LocalDateTime) scheduledTime;
    }


}
