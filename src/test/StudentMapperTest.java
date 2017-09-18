package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import mapper.StudentMapper;
import pojo.Student;

public class StudentMapperTest {
	SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws IOException {
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindById(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = studentMapper.findById(4);
		System.out.println(student);
		sqlSession.close();
	}

	@Test
	public void testFindByName(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.findByName("¾Å");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindPage(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		int index = 0;
		int pageSize = 4;
		List<Student> list = studentMapper.findPage(index, pageSize);
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindCount(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		int count = studentMapper.findCount();
		System.out.println("count=" + count);
	}
	
	@Test
	public void testFindByCondition(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setName("¾Å");
		student.setAge(12);
		student.setGender("ÄÐ");
		List<Student> list = studentMapper.findByCondition(student);
		for (Student student2 : list) {
			System.out.println(student2);
		}
	}
	
	@Test
	public void testDynaUpdate(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = new Student();
		student.setId(1);
		student.setAddress("ËÕÖÝ");
		studentMapper.dynaUpdate(student);
		sqlSession.commit();
		
	}
	
	@Test
	public void testFindByArray(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		int[] array = {1, 2, 3, 6 ,7};
		List<Student> list = studentMapper.findByArray(array);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudentInfos(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> list =studentMapper.findStudentInfos();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testFindStudentCourseInfos(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> list = studentMapper.findStudentCourseInfos();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
