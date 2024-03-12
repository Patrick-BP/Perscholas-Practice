package com.perscholas.GLAB30972SP13.model;


import lombok.*;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Column(unique = true)
    private Long accountNo;
    private Long marks;
}
