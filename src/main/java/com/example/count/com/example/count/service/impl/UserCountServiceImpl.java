package com.example.count.com.example.count.service.impl;

import com.example.count.com.example.count.dao.UserCount;
import com.example.count.com.example.count.mapper.UserCountMapper;
import com.example.count.com.example.count.service.UserCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen1
 * @annotation:实现类
 * @create 2018-07-31 14:32
 **/
@Service
public class UserCountServiceImpl implements UserCountService {
    @Autowired
    private UserCountMapper userCountMapper;

    @Override
    public boolean save(UserCount userCount) {
        boolean saveFlag = false;
        int a = userCountMapper.save(userCount);
        if(a>0){
            saveFlag= true;
        }
        return saveFlag;
    }

    @Override
    public List<UserCount> findAll() {
        List<UserCount> userCounts = userCountMapper.selectAll();
        return userCounts;
    }

    @Override
    public boolean update(UserCount userCount) {
        boolean updateFlag = false;
        int a = userCountMapper.update(userCount);
        if(a>0){
            updateFlag= true;
        }
        return updateFlag;
    }
}

