package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pojo.Student;

public interface StudentMapper {
	public abstract List<Student> findAll();
	public abstract Student findById(Integer id);
	public abstract List<Student> findByName(String name);
	public abstract List<Student> findPage(@Param(value="index")int index, @Param(value="pageSize")int pageSize);
	public abstract int findCount();
	public abstract List<Student> findByCondition(Student student);
	public abstract void dynaUpdate(Student student);
	public abstract List<Student> findByArray(int[] array);
	
	public abstract List<Student> findStudentInfos();
	public abstract List<Student> findStudentCourseInfos();
}
