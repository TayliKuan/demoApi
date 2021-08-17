package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Student;

@Mapper
public interface StudentMapper {
	@SelectKey(before = false,keyColumn = "stuno",keyProperty = "stuno",
		    statement = "select student_seq.CURRVAL as id from dual ",resultType = Integer.class)
	@Insert("Insert into STUDENT "
			+ "values((student_seq.NEXTVAL),"
			+ "#{stuname,jdbcType=VARCHAR},"
			+ "#{stumail,jdbcType=VARCHAR} ,"
			+ "#{stusex,jdbcType=VARCHAR}, "
			+ "TO_DATE(#{stubir,jdbcType=VARCHAR},'YYYYMMDD'),"
			+ "null)")
	public void create(Student student);//圖片先NULL
	
	@Select("Select * from student")
	public List<Student> readAll();
	
	@Select("Select * from student where stuno=#{stuno,jdbcType=VARCHAR}")
	public Student read(Integer stuno);
	
	@Update("UPDATE student  SET  stuname = #{stuname,jdbcType=VARCHAR}, stumail = #{stumail,jdbcType=VARCHAR}, stusex = #{stusex,jdbcType=VARCHAR}, stubir = TO_DATE(#{stubir,jdbcType=VARCHAR},'YYYYMMDD') where stuno = #{stuno,jdbcType=VARCHAR}")
	public void update(Student student);
	
	@Delete("DELETE FROM student WHERE stuno=#{stuno,jdbcType=VARCHAR}")
	public void delete(Integer stuno);
}
