package com.alonly.spring.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/2/28 0028 上午 10:35
 * @Description 反射
 */
public class DemoReflect {

  /**
   * normal
   */
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
      InvocationTargetException, InstantiationException, IllegalAccessException {
    // normal 1:
    TestStudent testStudent = new TestStudent();
    testStudent.setId(1l);
    testStudent.setName("Tom");
    testStudent.setAge(20);
    testStudent.toPrintInfo();

    // normal 2:
    TestStudent student = new TestStudent(2l, "jack ", 30);
    student.toPrintInfo();

    // reflect:
    TestStudent reflect = initStudentByReflect();
    reflect.toPrintInfo();
  }

  public static TestStudent initStudentByReflect()
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    // ①通过类装载器获取TestStudent类对象
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    Class clazz = classLoader.loadClass("com.alonly.spring.reflect.TestStudent");
    // ②获取类的默认构造器对象并通过它实例化TestStudent
    Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
    TestStudent student = (TestStudent) constructor.newInstance();
    // ③通过反射方法设置属性
    Method setId = clazz.getMethod("setId", long.class);
    setId.invoke(student, 12l);

    Method setName = clazz.getMethod("setName", String.class);
    setName.invoke(student, "reflect");

    Method setAge = clazz.getMethod("setAge", int.class);
    setAge.invoke(student, 12);

    return student;
  }
}

