package ren.baojie.baojieren.dao;

import ren.baojie.baojieren.model.UserPO;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);
}