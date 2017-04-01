package List1;

import com.company.ArrayExec;
import com.company.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class ArrayTest {

    @Test
    public void shouldFindLastElementFromAlist() {

        assertThat(ArrayExec.last(asList("a", "b", "c", "c")), is(equalTo("c")));

    }

    @Test
    public void shouldFindLastElementFromALinkedList() {

        LinkedList<String> list = CollectionUtils.linkedList("a", "b", "c");

        assertThat(ArrayExec.last(list), is(equalTo("c")));

    }
  /*  @Test
    public void shouldFindLastElementfromAListUsingRecursion(){
        assertThat(ArrayExec.lastRecursive(asList("a", "b", "c")) , is(equalTo("c")));
    }
*/


  @Test
    public void listOfEmptyListShouldBe0(){
      long length = ArrayExec.length(Collections.emptyList());
      assertThat(length, is(equalTo(0L)));
  }

  @Test
    public void shouldFindListOfNonEmptyList(){
        assertThat(ArrayExec.length(asList(1,2,3,4,5,6)), is(equalTo(6L)));
  }

  @Test
    public void reverseThisList(){
      List<Integer> numbers = asList(1,2,3,4,5,6,7);
        assertThat(ArrayExec.reverse(numbers) , is(equalTo(asList(7,6,5,4,3,2,1))));
  }

  @Test
    public void shouldreturnTrueWhenListIsPalindrome(){

        assertTrue(ArrayExec.isPalindrome(asList("a", "l", "a")));
  }

  @Test
public void shouldRemoveDuplicat(){

        List<String> compressedList = ArrayExec.compress(asList("a", "b", "a", "b" , "D"));
        assertThat(compressedList, contains("a", "b"));
  }



}
