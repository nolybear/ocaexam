package looping;

/**
 * Created by Ben on 11/05/2017.
 */
public class BreakOnLabel {
    public static void main(String[] args) {
        int ar[][] = {{1,0},{-4},{3,1}};
        f1:for(int[] a : ar) {
            for(int x = 0; x<a.length; x++) {
                if(a[x] < 0) break f1;
                System.out.print(a[x]);
            }
        }
    }
}
