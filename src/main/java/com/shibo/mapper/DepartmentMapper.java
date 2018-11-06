package com.shibo.mapper;

import com.shibo.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// @Mapper // 改为在application中注解扫描包，不然每个mapper都需要添加一个@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id = #{id}")
    public Department getDepartment(Integer id);
}
