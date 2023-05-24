package com.food.app.Enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Vendors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Vendor_id;

    private String VendorName;

    private  String VendorPassword;

    @OneToMany(mappedBy = "vendor")
    private List<ScheduleMeal> scheduledMeals;

    public Long getId() {
        return Vendor_id;
    }
}
