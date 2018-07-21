package com.zgm.service.impl;

import com.zgm.domain.User;
import com.zgm.repository.CommonMapper;
import com.zgm.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private CommonMapper commonMapper;
    @Override
    public List<User> getAllUsers() {
        return commonMapper.getAllUsers();
    }
}
