package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.Student;

public class MyBatisTest {
	SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws IOException {
		// 加载核心配置文件
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindByName() throws IOException {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Student> list = sqlSession.selectList("student.findByName", "九");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void testFindById() throws IOException {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		Student student = sqlSession.selectOne("student.findById", 2);
		System.out.println(student);
		sqlSession.close();
	}
	
	@Test
	public void testFindAll() throws IOException {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<Student> list = sqlSession.selectList("student.findAll");
		for (Student student : list) {
			System.out.println(student);
		}
		sqlSession.close();
	}
	
	@Test
	public void deleteById() throws IOException {

		SqlSession sqlSession = sqlSessionFactory.openSession();

		int result = sqlSession.delete("student.deleteById", 10);
		System.out.println(result);
		sqlSession.commit();
		sqlSession.close();
	}

}
