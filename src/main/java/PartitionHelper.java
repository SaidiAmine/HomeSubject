public class PartitionHelper {
  /**
   * static method to create sub lists from a given list and a given size of sub lists
   * @param givenList main list of integers
   * @param givenSize size of sub lists
   * @return bi-dimensional array of sub arrays
   */
  public static int[][] partition(int[] givenList, int givenSize) {
    int size = givenList.length / givenSize + givenList.length % givenSize;
    int[][] result = new int[size][givenSize];
    int anchor = givenSize-1;
    int counter =0;
    for(int x=0; x<size; x++){
      for(int y=0; counter<=anchor&&counter<givenList.length; y++){
        result[x][y] = givenList[counter];
        counter++;
      }
      anchor=anchor+givenSize;
    }
    return result;
  }
}
