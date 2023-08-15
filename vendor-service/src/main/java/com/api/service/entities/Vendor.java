package com.api.service.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @ToString @EqualsAndHashCode @Builder @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "vendors")
public class Vendor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendor")
    private Integer id;
    @Column(name = "name_vendor",length = 50)
    private String name;
    @Column(name = "last_name_vendor",length = 50)
    private String lastName;
    @Column(name = "email_vendor")
    private String email;
    @Column(name = "phone_vendor",length = 50)
    private String phone;
    @Column(name = "address_vendor",length = 120)
    private String address;
    @Column(name = "web_vendor")
    private String web;
}
