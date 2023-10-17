package me.dio.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "account_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    public String getNumber(){return number;}
    public void setNumber(String number){this.number = number;}
    public BigDecimal getBalance(){return balance;}
    public void setBalance(BigDecimal balance){this.balance = balance;}

}
