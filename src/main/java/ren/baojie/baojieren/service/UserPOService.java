package ren.baojie.baojieren.service;

import ren.baojie.baojieren.model.UserPO;

public interface UserPOService{


    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);

}
