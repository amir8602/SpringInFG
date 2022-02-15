package com.amir.entities;

import lombok.*;

import javax.persistence.*;
import java.awt.print.PrinterAbortException;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String price;
    @Column
    private Date createDate;
    @Column
    private Date updateDate;
    @Column
    private Boolean active;

}
