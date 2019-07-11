package looping;

public class UnreachableCode {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            continue;
//            System.out.println("can't get here"); // will not compile, unreachable statement
        }
    }
}
