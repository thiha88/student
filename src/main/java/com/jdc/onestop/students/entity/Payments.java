package com.jdc.onestop.students.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paidDate;
    private int toPaid;
    private int paidAmount;

    @ManyToOne
    private Registration registration;
}
