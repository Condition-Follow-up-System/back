package com.hnzyydx.doctor.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hnzyydx.doctor.dao.DiagnosisDao;
import com.hnzyydx.doctor.entity.DiagnosisEntity;
import com.hnzyydx.doctor.service.DiagnosisService;
import org.springframework.stereotype.Service;


/**
 */
@Service("DiagnosisService")
public class DiagnosisServiceImpl extends ServiceImpl<DiagnosisDao, DiagnosisEntity> implements DiagnosisService {


}
