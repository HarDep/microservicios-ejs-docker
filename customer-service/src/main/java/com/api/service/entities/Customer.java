package com.api.service.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @ToString @EqualsAndHashCode @Builder @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "customers")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer id;
    @Column(name = "name_customer",length = 50)
    private String name;
    @Column(name = "last_name_customer",length = 50)
    private String lastName;
    @Column(name = "email_customer")
    private String email;
    @Column(name = "phone_customer",length = 50)
    private String phone;
    @Column(name = "address_customer",length = 120)
    private String address;
}
