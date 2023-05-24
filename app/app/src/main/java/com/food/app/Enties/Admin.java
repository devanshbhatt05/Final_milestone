package com.food.app.Enties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Admin")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Admin_id;

    private String Admin_name;

    private String AdminPassword;

}

