package com.btao.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by S_TU on 2019/12/18
 */
@Data
@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private String epass;
    private double salary;
    private String addr;
}
