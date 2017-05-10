package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by wenjing on 2017/5/10.
 */
@Entity
@Table(name = "staff")
@Setter
@Getter
@ToString
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String staffName;

    private String staffAge;
}
