package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("doctor_patient")
public class PatientEntity {

     private long id;

     private String idNo;

     private String name;
}
