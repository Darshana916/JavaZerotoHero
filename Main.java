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
        char[] myStr4= {'H', 'e', 'l', 'l', 'o'};
        String myStr5= "";
        myStr5 = myStr5.copyValueOf(myStr4, 0, 5);
        byte [] resByt = myStr.getBytes();
        String myStr6 = "Another String";
        String bytes = "Hello %s! One kilobyte is %,d bytes.";
        String run = String.format(bytes,"World",1024);
        String ind = "Hello Planet earth, you are a great planet";
        String fruits = String.join(" ", "Orang", "Apple", "Mango");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String regex = "cat|dog|fish";
        int offres = myStr.offsetByCodePoints(3,2);
        String regi1 = "Hello, World";
        String regi2 = "New World";
        String str = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regexi = "(?i)cat";
        String regexii = " ";
        String Q = "     Hello World     ";



        //split()
        String strMy = "Split a String by spaces, and also punctuation";
        String regexx = "[,\\.\\s]";
        String[] myArrays = strMy.split(regexx);
        for (String s : myArrays) {



        char[] myArray = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(myArray);

        String hel = "Hello World";
        myStr.getChars(7, 10,myArray,4);
        System.out.println(myArray);    //getChars()


        System.out.println(result);   //charAt()
        System.out.println(res);   //codePointAt()
        System.out.println(re);   //codePointBefore()
        System.out.println(r);   //codePointCount()
        System.out.println(myStr1.compareTo(myStr2));   //compareTo()
        System.out.println(myStr2.compareToIgnoreCase(myStr3));   //compareToIgnoreCase()
        System.out.println(firstName.concat(lastName));   //concat()
        System.out.println(myStr3.contains("HE"));
        System.out.println(myStr3.contains("E"));
        System.out.println(myStr3.contains("Hi"));   //contains()
        System.out.println(myStr3.contentEquals("HELLO"));
        System.out.println(myStr3.contentEquals("e"));
        System.out.println(myStr3.contentEquals("Hi"));   //contentEquals()
        System.out.println("Returned Srting :" + myStr5);   //copyValueOf()
        System.out.println(myStr1.endsWith("Hel"));
        System.out.println(myStr1.endsWith("lo"));   //endsWith()
        System.out.println(myStr1.equals(myStr2));
        System.out.println(myStr1.equals(myStr6));   //equals()
        System.out.println(run);   //format()
        System.out.println(resByt[0]); //geBytes()
        System.out.println(myStr1.hashCode());   //hashCode()
        System.out.println(ind.indexOf("Planet"));   //indexOf()
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr5.isEmpty());   //isEmpty()
        System.out.println(fruits);   //join()
        System.out.println(ind.lastIndexOf("planet"));   //lastIndexOf()
        System.out.println(txt.length());   //length()
        System.out.println("cat".matches(regex));
        System.out.println("dog".matches(regex));
        System.out.println("doggy bag".matches(regex));   //matches()
        System.out.println(offres);   //offsetByCodePoint
        System.out.println(regi1.regionMatches(7,regi2,4,5));
        System.out.println(regi1.regionMatches(0,regi2,0,5));   //regionMaches()
        System.out.println(myStr.replace('l','p'));   //replace()
        System.out.println(str.replaceAll(regexi,"dog"));   //replaceAll()
        System.out.println(str.replaceFirst(regexii," will "));   //replaceFirst()
        System.out.println(s);   //split()
        System.out.println(myStr1.startsWith("Hel"));
        System.out.println(myStr1.startsWith("llo"));   //startsWith
        System.out.println(myStr.subSequence(6,10));   //subSequence
        char[] myAArray = myStr.toCharArray();
        System.out.println(myAArray[0]);   //toCharArray
        System.out.println(Q);
        System.out.println(Q.trim());   //trim()
        char[] myArrayy = {'a','b','c'};
        System.out.println(String.valueOf(myArrayy));
        System.out.println(String.valueOf('A'));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(4.5f));
        System.out.println(String.valueOf(12));
        System.out.println(String.valueOf(1400L));   //valueOf



//Adding Numbers and String

        int xxx = 10;
        int yyy = 20;
        int zzz = xxx + yyy;
        System.out.println(zzz);   

        String xxxxx = "10";
        String yyyyy = "20";
        String zzzz = "xxxxx + yyyyy" ;
        System.out.println(zzzz);

        int aaa = 10;
        String bbbbbb = "20";
        String uuu = aaa + bbbbbb;
        System.out.println(uuu);



//Java Special Characters

//String - Special Character

        String speci = "We are the so called \"vikings\" from the north.";   
        System.out.println(speci);
        String tu = "It\'s alright";
        String tuv = "The character \\ is called backslash";
        System.out.println(tu);
        System.out.println(tuv);
        String tuvw = "Hello\nWorld";   //new line
        String tuvwx = "Hello\rWorld";   //carriage return
        String tuvwxy = "Hello\tWorld";   //tab
        String tuvwxyz = "Hello\bWorld";   //back space
        System.out.println(tuvw);
        System.out.println(tuvwx);
        System.out.println(tuvwxy);
        System.out.println(tuvwxyz);


        }






    }
}