package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import java.util.Date;

@Data
@TableName("doctor_diagnosis")
public class DiagnosisEntity {

    private String content;

    private Date date;

    private long id;

    private long userId;
}
