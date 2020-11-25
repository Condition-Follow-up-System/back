package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("doctor_user")
public class UserEntity {

    private Long id;

    private String name;

    private String password;

    private String idNo;
}
