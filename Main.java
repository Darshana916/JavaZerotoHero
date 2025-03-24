//Java Operators (+)
public class Main {
    public static void main(String[] args) {
        int x = 100 + 50;
        System.out.println(x);
    

 // using + operator we can add together value and variable , variable and variable

        int num1 = 100 +50 ;
        int num2 = num1 + 250 ;
        int num3 = num1 + num2 ;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        

 // Comparison operator, greater than (>)
 
        int a = 5;
        int y = 3;
        System.out.println(a>y);   // return True


// Equal (==)

        int b = 5;
        int c = 3;
        System.out.println(b==y);  // return Fales

        int bb = 5;
        int cc = 5;
        System.out.println(bb==cc);  // return True

// Not Equal (!=)

        int bbb = 5;
        int ccc = 3;
        System.out.println(bbb!=ccc);  // return True

// Greter than or equal (>=)

        int bbbb = 5;
        int cccc = 3;
        System.out.println(bbbb>=cccc);  // return True

// Less than or equal (<=)

        int bbbbb = 5;
        int ccccc = 3;
        System.out.println(bbbbb<=ccccc);  // return Fales


// Java Logical Operators

// Logical AND (&&)

        int d = 3;
        System.out.println(d<5&&d<10);
        System.out.println(d<5&&d>10);  // return True, if both statement are True, if not retun Fales

// Logical NOT (!)

        int dd = 3;
        System.out.println(!(dd<5&&dd<10));  //  Revers result
    }
}