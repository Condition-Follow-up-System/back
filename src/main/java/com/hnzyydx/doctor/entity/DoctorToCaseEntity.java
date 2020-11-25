package com.hnzyydx.doctor.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("doctor_case")
public class DoctorToCaseEntity {

    private long id;

    private long caseId;

    private long doctorId;
}
