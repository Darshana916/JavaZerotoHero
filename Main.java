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


// Java String Methods

        String myStr = "Hello Java";
        char result = myStr.charAt(6);
        int res = myStr.codePointAt(0);
        int re = myStr.codePointBefore(1);
        int r = myStr.codePointCount(0,5);
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "HELLO";
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(result);   //charAt()
        System.out.println(res);   //codePointAt()
        System.out.println(re);   //codePointBefore()
        System.out.println(r);   //codePointCount()
        System.out.println(myStr1.compareTo(myStr2));   //compareTo()
        System.out.println(myStr2.compareToIgnoreCase(myStr3));   //compareToIgnoreCase()
        System.out.println(firstName.concat(lastName));   //concat()
        System.out.println(myStr3.contains("HE"));
        System.out.println(myStr3.contains("E"));
        System.out.println(myStr3.contains("Hi"));   //contains
        System.out.println(myStr3.contentEquals("HELLO"));
        System.out.println(myStr3.contentEquals("e"));
        System.out.println(myStr3.contentEquals("Hi"));   //contentEquals


    }
}