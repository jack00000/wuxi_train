package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Dorm;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DormMapper {

    @Select("select * from dorm_ ")
    List<Dorm> findAll();

    @Insert(" insert into dorm_ ( name ) values (#{type}) ")
    public String save(Dorm dorm);

    @Delete(" delete from dorm_ where id= #{id} ")

    public void delete(String id);

    @Select("select * from dorm_ where id= #{id} ")
    public Dorm get(String id);

    @Update("update dorm_ set type=#{type} where id=#{id} ")
    public String update(Dorm dorm);
}
