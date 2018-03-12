package com.fixed.asset.mapper;

import com.fixed.asset.model.User;
import com.fixed.asset.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

public interface UserMapper {
    long countByExample(UserExample example) throws DataAccessException;

    int deleteByExample(UserExample example) throws DataAccessException;

    int deleteByPrimaryKey(Integer userId) throws DataAccessException;

    int insert(User record) throws DataAccessException;

    int insertSelective(User record) throws DataAccessException;

    List<User> selectByExample(UserExample example) throws DataAccessException;

    User selectByPrimaryKey(Integer userId) throws DataAccessException;

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) throws DataAccessException;

    int updateByExample(@Param("record") User record, @Param("example") UserExample example) throws DataAccessException;

    int updateByPrimaryKeySelective(User record) throws DataAccessException;

    int updateByPrimaryKey(User record) throws DataAccessException;

	List<User> selectUserAndRolesByExample(UserExample um) throws DataAccessException;
}