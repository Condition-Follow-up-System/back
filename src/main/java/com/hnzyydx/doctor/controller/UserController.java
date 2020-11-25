package com.hnzyydx.doctor.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hnzyydx.doctor.dto.LoginDto;
import com.hnzyydx.doctor.dto.RecordListDto;
import com.hnzyydx.doctor.entity.DiagnosisEntity;
import com.hnzyydx.doctor.entity.PatientEntity;
import com.hnzyydx.doctor.entity.UserEntity;
import com.hnzyydx.doctor.service.DiagnosisService;
import com.hnzyydx.doctor.service.PatientService;
import com.hnzyydx.doctor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DiagnosisService  diagnosisService;

    @PostMapping(value = "/register")
    public Map register(@RequestBody LoginDto loginDto){
        Map  map = new HashMap();
        PatientEntity patientEntity = patientService.selectOne(new EntityWrapper<PatientEntity>()
            .eq("id_no",loginDto.getIdNo())
        );
        if(patientEntity==null){
            map.put("code","-1");
            map.put("data","查无此身份证信息");
            return map;
        }

        UserEntity  userEntity = userService.selectOne(new EntityWrapper<UserEntity>()
            .eq("id_no",loginDto.getIdNo())
        );

        if(userEntity!=null){
            map.put("code","-1");
            map.put("data","此身份证信息已经注册");
            return map;
        }

        UserEntity  userEntity1 = new UserEntity();
        userEntity1.setIdNo(loginDto.getIdNo());
        userEntity1.setPassword(loginDto.getPassword());
        userEntity1.setName(patientEntity.getName());
        userService.insert(userEntity1);

        map.put("code","0");
        map.put("data",userEntity1);
        return map;
    }



    @PostMapping(value = "/login")
    public Map login(@RequestBody LoginDto loginDto){
        Map  map = new HashMap();
        UserEntity  userEntity = userService.selectOne(new EntityWrapper<UserEntity>()
                .eq("id_no",loginDto.getIdNo())
                .eq("password",loginDto.getPassword())
        );
        if(userEntity==null){
            map.put("code","-1");
            map.put("data","查无此账号信息");
            return map;
        }
        map.put("code","0");
        map.put("data",userEntity);
        return map;
    }

    @PostMapping(value = "/recordList")
    public Map recordList(@RequestBody RecordListDto recordListDto){
        Map  map = new HashMap();
        List<DiagnosisEntity> diagnosisEntityList = diagnosisService.selectList(new EntityWrapper<DiagnosisEntity>()
           .eq("user_id",recordListDto.getUserId()+"")
        );
        map.put("code","0");
        map.put("data",diagnosisEntityList);
        return map;
    }




}
