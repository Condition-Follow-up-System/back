package com.hnzyydx.doctor.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hnzyydx.doctor.dao.UserDao;
import com.hnzyydx.doctor.entity.UserEntity;
import com.hnzyydx.doctor.service.UserService;
import org.springframework.stereotype.Service;


/**
 */
@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {


}
