package com.jdc.onestop.students.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ClassDays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String daysOfWeek;

    @ManyToOne
    private Class aClass;
}
