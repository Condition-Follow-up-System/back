package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("doctor")
public class DoctorEntity {

    private String name;

    private long id;

    private String password;

}
