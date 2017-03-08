package com.alonly.algorithm.sort;

/**
 * @author lct
 * @version 1.0.0
 * @mail luochunteng@163.com
 * @date 2017/3/8 0008 下午 16:01
 * @Description 每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止.时间复杂度：O（n^2）.
 */
public class InsertSort {

  public static void main(String[] args) {
    int[] numbers = {102, 1, 33, 32, 25, 77, 5, 41, -5, 29};
    insertSort(numbers);
    for (int i = 0; i <= numbers.length - 1; i++) {
      System.out.print(numbers[i] + " ");
    }
  }

  /**
   * 插入排序
   *
   * 从第一个元素开始，该元素可以认为已经被排序 取出下一个元素，在已经排序的元素序列中从后向前扫描 如果该元素（已排序）大于新元素，将该元素移到下一位置
   * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置 将新元素插入到该位置中 重复步骤2
   * 
   * @param numbers 待排序数组
   */
  public static void insertSort(int[] numbers) {
    int size = numbers.length;
    int temp = 0;
    int j = 0;

    for (int i = 0; i < size; i++) {
      temp = numbers[i];
      // 假如temp比前面的值小，则将前面的值后移
      for (j = i; j > 0 && temp < numbers[j - 1]; j--) {
        numbers[j] = numbers[j - 1];
      }
      numbers[j] = temp;
    }
  }
}
