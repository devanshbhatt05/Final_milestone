package com.food.app.Enties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class ScheduleMealMultiple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDateTime scheduledTime;
    @ManyToMany
    @JoinTable(
            name = "schedule_meal_multiple_vendor",
            joinColumns = @JoinColumn(name = "schedule_meal_multiple_id"),
            inverseJoinColumns = @JoinColumn(name = "vendor_id")
    )
    private List<Vendor> vendors;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;

    public void setScheduledTime(Object scheduledTime) {
        this.scheduledTime = (LocalDateTime) scheduledTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVendors(List<Vendor> vendors) {
       this.vendors =vendors;
    }
}