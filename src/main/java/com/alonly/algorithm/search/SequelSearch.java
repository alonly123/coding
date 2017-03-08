package com.alonly.algorithm.search;

/**
 * @author luoct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/3/8 0008 下午 16:43
 * @Description 顺序查找适合于存储结构为顺序存储或链接存储的线性表
 */
public class SequelSearch {
  public static void main(String[] args) {
    int[] src = new int[] {1, 3, 5, 7, 8, 9};
    System.out.println(sequelSearch(src, 3));
  }

  public static int sequelSearch(int[] array, int data) {
    if (array == null)
      return -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == data)
        return i;
    }
    return -1;
  }
}
