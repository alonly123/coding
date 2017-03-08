package com.alonly.spring.reflect;

/**
 * @author lct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/2/28 0028 上午 10:36
 * @Description
 */
public class TestStudent {

  private long id;
  private String name;
  private int age;

  public TestStudent() {

  }

  public TestStudent(long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public void toPrintInfo() {
    System.out.println("student id: " + id + ", name: " + name + ", age: " + age);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
