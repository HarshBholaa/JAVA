package Daily_Practice;

public class p30 {
    // function overloading:
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    // Variable Arguments (VarArgs) in Java:
    static int addition(int ...arr){
        // ...arr behave like an array int []arr.
        int result = 0;
        for (int a: arr) {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 10;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));

        System.out.println(addition(1));
        System.out.println(addition(1,2));
        System.out.println(addition(1,2,3));
        System.out.println(addition(1,2,3,4));
    }
}
