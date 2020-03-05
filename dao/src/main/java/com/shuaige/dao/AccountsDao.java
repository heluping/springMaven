package com.shuaige.dao;


import com.shuaige.bean.Accounts;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountsDao {
    @Select("select * from accounts where id = #{id}")
    Accounts findById(int id);

    @Insert("insert into accounts (name, money) values (#{name}, #{money})")
    int saveAccounts(Accounts accounts);
}
