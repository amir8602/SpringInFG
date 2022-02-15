package com.amir;


import com.amir.spring.core.Student;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    static ApplicationContext applicationContext;

  @BeforeClass
    public static void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("start");
    }


    @Test
    public void shouldAnswerWithTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void checkSingletonInitStudent() {
        Student student = (Student) applicationContext.getBean("student");
        Student student1 = (Student) applicationContext.getBean("student");
        Assert.assertTrue(student == student1);
    }

    @Test
    public void sumCheckMethod() {
        Student student = new Student();
        int actual = student.sum(5, 5);
        Assert.assertEquals(10, actual);
    }

    @Test
    public void studentMustHaveName(){
      Student actual = (Student) applicationContext.getBean("student");
      Assert.assertNotEquals(null , actual.getName());
    }

    @Test
    public void StudentMustHaveBookWhenInit(){
      Student actual = (Student) applicationContext.getBean("student");
      Assert.assertNotEquals(null , actual.getBook());
        System.out.println(applicationContext.getBean("historyBook"));
    }

    @AfterClass
    public static void resourceClose(){
        System.out.println("resource close");
    }


}
