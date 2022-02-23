import static org.junit.Assert.*;


import org.junit.Test;

public class PartitionHelperTest {

  @Test
  public void should_return_one_sublist_when_main_list_size_equals_sublists_size() {
    // Given
    int[] initialList = {0, 1, 2, 5, 5};
    // When
    int[][] testCase = PartitionHelper.partition(initialList, 5);
    // Then
    assertEquals(1, testCase.length);
  }

  @Test
  public void should_return_the_correct_number_of_sublists() {
    // Given
    int[] initialList = {0, 1, 2, 5, 5};
    // When
    int[][] testCase = PartitionHelper.partition(initialList, 1);
    // Then
    assertEquals(5, testCase.length);
  }

  @Test
  public void should_return_correct_sub_arrays() {
    // Given
    int[] initialList = {0, 1, 2, 5, 5, 6};
    // When
    int[][] testCase = PartitionHelper.partition(initialList, 2);
    // Then
    assertArrayEquals(new int[]{0, 1}, testCase[0]);
    assertArrayEquals(new int[]{2, 5}, testCase[1]);
    assertArrayEquals(new int[]{5, 6}, testCase[2]);
  }

}