package com.example.Barebones.model;


import jakarta.persistence.*;

@Entity
public class Role {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String name;

   public Role() {
   }

   public Role(String name) {
       this.name = name;
   }
   public Long getId() {
       return id;
   }
   public void setId(Long id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }

   @Override
   public String toString() {
	   return name;
//       return "Role{" +
//               "id=" + id +
//               ", name='" + name + '\'' +
//               '}';
   }
}
