package com.alonly.datastructure.list;

/**
 * @author lct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/3/2 0002 下午 15:05
 * @Description
 */
public class SingleNode {
  private String key;// 节点值
  private SingleNode next;// 下一个节点

  public SingleNode(String key) {// 初始化head节点
    this.key = key;
    this.next = null;
  }

  public SingleNode(String key, SingleNode nextNode) {
    this.key = key;
    this.next = nextNode;
  }

  @Override
  public String toString() {
    return "SingleNode[key=" + key + ", next=" + next + "]";
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SingleNode getNext() {
    return next;
  }

  public void setNext(SingleNode next) {
    this.next = next;
  }
}
