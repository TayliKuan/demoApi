package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Student;

//MYSQL

@Mapper
public interface StudentMapper {
	@SelectKey(before = false,keyProperty = "stuno",
		    statement = "SELECT LAST_INSERT_ID()",resultType = Integer.class)
	@Insert("INSERT into student (stuname,stumail,stusex,stubir)"
			+ "values("
			+ "#{stuname,jdbcType=VARCHAR},"
			+ "#{stumail,jdbcType=VARCHAR},"
			+ "#{stusex,jdbcType=VARCHAR},"
			+ "#{stubir,jdbcType=VARCHAR}"
			+ ")")
	public void create(Student student);
	
	@Select("SELECT * FROM student")
	public List<Student> readAll();
	
	@Select("SELECT * FROM student where stuno=#{stuno,jdbcType=VARCHAR}")
	public Student read(Integer stuno);
	
	@Update("UPDATE student  SET  stuname = #{stuname,jdbcType=VARCHAR}, stumail = #{stumail,jdbcType=VARCHAR}, stusex = #{stusex,jdbcType=VARCHAR}, stubir = #{stubir,jdbcType=VARCHAR}  where stuno = #{stuno,jdbcType=VARCHAR}")
	public void update(Student student);
	
	@Delete("DELETE FROM student WHERE stuno=#{stuno,jdbcType=VARCHAR}")
	public void delete(Integer stuno);
}
