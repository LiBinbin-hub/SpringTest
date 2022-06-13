package com.test.mapper;

import com.test.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select("select * from student where sid = 1")
    Student getStudent();

    @Insert("insert into student(name, age) values('测试', '22')")
    void insertStudent();
}
