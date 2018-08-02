package com.example.count.com.example.count.service;

import com.example.count.com.example.count.dao.UserCount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chen1
 * @annotation:service类
 * @create 2018-07-31 14:29
 **/
public interface UserCountService {
	
	boolean save(UserCount userCount);

	List<UserCount> findAll();

	boolean update(UserCount userCount);

}
