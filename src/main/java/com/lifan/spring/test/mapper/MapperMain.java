package com.lifan.spring.test.mapper;

import com.lifan.spring.test.AccountEntry;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author by LiFan
 * @date 2018/11/28
 */

@Mapper
public interface MapperMain {
    @Select({"select * from account"})
    @Results({@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
            @Result(column = "acc", property = "acc", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR)})
    List<AccountEntry> getAccountList();
}
