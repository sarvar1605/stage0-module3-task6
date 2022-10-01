package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        int d = 15; 
        
        int x = ++a + b + c + d;
        System.out.println("Expected x is 40, x = " + x);  
        
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + ++c + " and d = " + d);

    }
}
