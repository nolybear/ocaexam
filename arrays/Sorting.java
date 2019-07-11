package arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int array[] = {2,5,9,5,0,3};

        // toIndex is acceptable as 6 as the range is exclusive of the value given
        //  so the sort internally must be using 2-5
        //  assume so can do Arrays.sort(array, 2, array.length)
        Arrays.sort(array,2,6);
        System.out.println(Arrays.toString(array));
        System.out.println(array[2]+array[5]);
    }
}
