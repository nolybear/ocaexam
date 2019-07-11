package javalibs;

import java.util.ArrayList;
import java.util.List;

public class ListApi {

    public static void main(String[] args) {
        removeIf();
        arrayFromListWithResize();
    }

    private static void arrayFromListWithResize() {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        String[] arr = new String[2];
        arr = strings.toArray(arr); // assign values of list to provided array

        // notice that arr was declared with size of two
        //  a new array of size 3 was created and returned by toArray as provided array didn't have capacity for list
        for(String x : arr) {
            System.out.print(x); // output 123
        }
    }

    private static void removeIf() {

        // creating list like this causes unsupported operation exception because the underlying Array doesn't support removeIf method
        //      List<Integer> testList = Arrays.asList(10,23,34, 5, 97);

        List<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(23);
        testList.add(33);
        testList.add(74);
        testList.add(14);
        testList.add(43);

        // removeIf in List interface should remove all elements where predicate matches
        testList.removeIf(e -> e < 30);

        // out put all numbers in list, this should be all of original numbers that are >= 30
        //  should still have: 33, 74, 43
        //  should have been removed: 3, 23, 14
        System.out.println(testList);
    }

}
