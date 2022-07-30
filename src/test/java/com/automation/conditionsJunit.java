package com.automation;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class conditionsJunit extends common {
      /**
       * Java Conditions Test :-)
       */
      public conditionsJunit() {
            super();
      }

      @Before
      public void start_testing() {
            System.out.println("start_testing " + ManagementFactory.getRuntimeMXBean().getName());
      }

      @Test
      public void checkNumberClass_01() {
            MynumberClass myNumberClass = new MynumberClass(37);
            Assert.assertTrue("This is not a prime", myNumberClass.checkIfPrime());
            Assert.assertFalse("This is wrong", MynumberClass.needToBeInitiated);
      }

      @Test
      public void testMychar() {
            String myString = "JavaProgramming.com";
            char[] listOfChars = { 'J', 'A', 'V', 'A' };
            String myCourse = new String(listOfChars);
            System.out.println(myCourse);
            System.out.print(myString+"\n");
      }

      @Test
      public void conCatStrings() {
            String str1 = "Java";
            String str2 = "Programming.com";
            String str3 = str1.concat(str2);
            System.out.println("Concat two string "+ str1+" and "+str2 +" = "+str3);
            String str4 = str1+str2;
            System.out.println(String.format("Format %d strings \"%s\" and \"%s\" : %s",2,str1, str2 ,str4));
      }

      @Test(timeout = 1000)
      public void checkIfNumberIsPrime_01() {
            Assert.assertTrue("This is not a prime", isPrime(13));
      }

      @Test
      public void checkIfNumberIsPrime_02() {
            Assert.assertTrue("This is not a prime", isPrime(20));
      }

      @Test
      public void checkIfNumberIsNotPrime_01() {
            Assert.assertFalse("This is not a prime", isPrime(20));
      }

      @Test
      public void checkIfNumberIsNotPrime_02() {
            Assert.assertFalse("This is not a prime", isPrime(37));
      }

      @Test
      public void testIsSubString_01() {
            String a = "Hello World";
            String b = "o W";
            try {
                  Assert.assertTrue(String.format("%s is not a part of %s", b, a), isSubstring(a.toLowerCase(), b.toLowerCase()));
            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }
            String testStr = a.toLowerCase();
            String subStr = b.toLowerCase();
            System.out.println(String.format("\'%s\' is  a part of \'%s\'", b, a));
      }

      @Test
      public void testexp() {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s =  scan.nextLine();
            while(scan.hasNextLine()) {
                  s += scan.next() + " ";
              }
              //
            // Write your code here.
    
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
            scan.close();
        }

        
      @Test
      public void testexp1() {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s",s1);
                System.out.printf("%03d%n",x);
            }
            System.out.println("================================");
            sc.close();
        }

      @AfterClass
      public static void end_testing() {
            System.out.println("end_testing");
      }
}
