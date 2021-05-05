import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        a= sc.nextDouble();
        System.out.println("b:");
        b= sc.nextDouble();
        System.out.println("c:");
        c= sc.nextDouble();
        if(a!=0){
            double d = (c-b)/a;
            System.out.println("đáp án là : " + d);
        }else {
            System.out.println("vô nghiệm");
        }
    }
}
