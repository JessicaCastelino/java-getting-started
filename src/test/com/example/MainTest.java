/**
 * 
 */
package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

	@Test
	public void getStudentAge() {
		Student s1=new Student(1,"Jessica",24);
		assertEquals("getStudentAge", 24,s1.getAge());
	}
	
	@Test
	public void getStudentName() {
		Student s1=new Student(1,"Jessica",24);
		assertEquals("getStudentAge", "Jessica",s1.getName);
	}

}
