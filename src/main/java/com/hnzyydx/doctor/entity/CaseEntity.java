package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("case")
public class CaseEntity {

    private long id;

    private String path;

    private long userId;

    private long doctorId;

    private String advice;
}
