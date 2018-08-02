package com.example.count.com.example.count.mapper;

import com.example.count.com.example.count.dao.UserCount;
import org.apache.ibatis.annotations.Mapper;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author chen1
 * @annotation:mapper类
 * @create 2018-07-31 14:09
 **/
@Mapper
public interface UserCountMapper {
    //保存
     int save(UserCount userCount);
     //查询
     List<UserCount> selectAll();
     //更新
     int update(UserCount userCount);
     //主键查询
     UserCount selectByPk(int countId);

}

