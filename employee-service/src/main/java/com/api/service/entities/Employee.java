package com.api.service.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @ToString @EqualsAndHashCode @Builder @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "employees")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer id;
    @Column(name = "name_employee",length = 50)
    private String name;
    @Column(name = "last_name_employee",length = 50)
    private String lastName;
    @Column(name = "email_employee")
    private String email;
    @Column(name = "phone_employee",length = 50)
    private String phone;
    @Column(name = "address_employee",length = 120)
    private String address;
    @Column(name = "salary_employee")
    private Double salary;
}
