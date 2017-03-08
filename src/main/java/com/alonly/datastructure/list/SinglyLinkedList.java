package com.alonly.datastructure.list;

/**
 * @author lct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/3/2 0002 下午 14:48
 * @Description 单向链表
 */
public class SinglyLinkedList {

  private SingleNode head = null;// 头结点
  private SingleNode foot = null;// 尾结点（空结点）

  /**
   * 初始化链表
   * 
   * @param head
   */
  public void initSingleList(SingleNode head) {
    this.head = head;
    this.head.setNext(foot);
  }

  public void addNode(SingleNode singleNode) {
    if (this.head == null) {
      initSingleList(singleNode);
    } else {
      SingleNode temp = singleNode;
      this.head = singleNode;
      singleNode.setNext(temp);
    }
  }

  public void deleteNode(SingleNode singleNode, SinglyLinkedList myList) {
    if (myList == null) {
      return;
    }
    SingleNode temp = null;
    for (temp = myList.getHead(); temp != null; temp = temp.getNext()) {
      if (temp.getNext() != null && singleNode.getKey().equals(temp.getNext().getKey())) {// 该元素和后一个元素相同。指针指向下一元素的下一元素
        if (temp.getNext().getNext() != null) {
          temp.setNext(temp.getNext().getNext());
        } else {
          temp.setNext(null);
        }
      }
    }
  }


  public SingleNode getHead() {
    return head;
  }

  public void setHead(SingleNode head) {
    this.head = head;
  }

  public SingleNode getFoot() {
    return foot;
  }

  public void setFoot(SingleNode foot) {
    this.foot = foot;
  }
}
