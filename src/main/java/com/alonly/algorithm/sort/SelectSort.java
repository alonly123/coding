package com.alonly.algorithm.sort;

/**
 * @author luoct
 * @version 1.0.0
 * @mail luoct@jingoal.com
 * @date 2017/3/8 0008 下午 15:58
 * @Description 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SelectSort {
  public static void main(String[] args) {
    int[] numbers = {102, 1, 33, 32, 25, 77, 5, 41, -5, 29};
    selectSort(numbers);
    for (int i = 0; i <= numbers.length - 1; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  public static void selectSort(int[] numbers) {
    int size = numbers.length; // 数组长度
    int temp = 0; // 中间变量
    for (int i = 0; i < size; i++) {
      int k = i; // 待确定的位置
      // 选择出应该在第i个位置的数
      for (int j = size - 1; j > i; j--) {
        if (numbers[j] < numbers[k]) {
          k = j;
        }
      }
      // 交换两个数
      temp = numbers[i];
      numbers[i] = numbers[k];
      numbers[k] = temp;
    }
  }
}
