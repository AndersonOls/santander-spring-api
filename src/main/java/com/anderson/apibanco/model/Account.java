package com.anderson.apibanco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name="tb_account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String agency;

    @Column(precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name = "additional_limit",precision = 2, scale = 13)
    private BigDecimal limit;
}
