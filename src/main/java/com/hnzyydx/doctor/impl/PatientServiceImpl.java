package com.hnzyydx.doctor.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hnzyydx.doctor.dao.PatientDao;
import com.hnzyydx.doctor.entity.PatientEntity;
import com.hnzyydx.doctor.service.PatientService;
import org.springframework.stereotype.Service;


/**
 */
@Service("PatientService")
public class PatientServiceImpl extends ServiceImpl<PatientDao, PatientEntity> implements PatientService {


}
