package com.yayako.user.mapper;

import com.yayako.user.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TUserMapper {
    int insert(TUser record);

    int insertSelective(TUser record);
}