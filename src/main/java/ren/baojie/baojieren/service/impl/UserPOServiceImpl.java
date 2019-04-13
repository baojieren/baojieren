package ren.baojie.baojieren.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ren.baojie.baojieren.dao.UserMapper;
import ren.baojie.baojieren.model.UserPO;
import ren.baojie.baojieren.service.UserPOService;

import javax.annotation.Resource;

@Service
public class UserPOServiceImpl implements UserPOService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insertSelective(UserPO record) {
        int i = userMapper.insertSelective(record);
        i = 1/0;
        return i;
    }

    @Override
    public UserPO selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserPO record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

}
