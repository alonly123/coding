package com.alonly.algorithm.sort;

/**
 * @author luoct
 * @version 1.0.0
 * @mail luoct@jingoal.com
 * @date 2017/3/8 0008 下午 15:17
 * @Description
 */
public class BubbleSort {

  public static void main(String[] args) {
    int[] numbers = {102, 1, 33, 32, 25, 77, 5, 41, -5, 29};
    bubbleSort(numbers);
    for (int i = 0; i <= numbers.length - 1; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  public static void bubbleSort(int[] numbers) {
    int temp = 0;
    int size = numbers.length;
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - 1 - i; j++) {
        if (numbers[j] > numbers[j + 1]) {// 交换两数位置
          temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }

}
