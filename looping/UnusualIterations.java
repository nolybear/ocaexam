package looping;

public class UnusualIterations {
    public static void main(String[] args) {
        infinateLoop();
    }

    private static void infinateLoop() {
        for(int i = 10; i > 5; i++) {

            if(i == 16) {
                // set i to 5
                // given the i++ increment happens at the end of each loop iteration
                // i will be 6 when we come back to the loop control condition (i > 5)
                // as such the loop will never end, just print 10->15, then sequences of 5->15 indefinately
                i -=11;
            }
            System.out.println("i: " + i);
        }
    }
}
