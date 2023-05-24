package com.food.app.Enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="menus")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String  schedule; // breakfast, lunch . dinner
    private String category; // veg or non-veg

    private String menu_name;

    private  double price;


    @ManyToOne
    private Vendor vendor;

    private boolean approved;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", schedule='" + schedule + '\'' +
                ", category='" + category + '\'' +
                ", menu_name='" + menu_name + '\'' +
                ", price=" + price +
                ", vendor=" + vendor +
                " " +
                '}';
    }
}
