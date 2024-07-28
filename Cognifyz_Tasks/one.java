import java.util.Scanner;

public class one {
    //-------------------------------hollow square--------------------//
    public static void printPattern1(int n1)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n1; i++) {
            //  inner loop to handle number of columns
            for (j = 0; j < n1; j++) {
                // star will print only when  it is in first
                // row or last row or first column or last
                // column
                if (i == 0 || j == 0 || i == n1 - 1
                    || j == n1 - 1) {
                    System.out.print("*");
                }
                // otherwise print space only.
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//---------------------------------rhombus pattern------------------------------------------//
public static void printPattern2(int n2)
{
    int i, j;
    int num = 1;
    // outer loop to handle number of rows
    for (i = 1; i <= n2; i++) {
        // inner loop to print spaces
        for (j = 1; j <= n2 - i; j++) {
            System.out.print(" ");
        }

        // inner loop to print stars
        for (j = 1; j <= n2; j++) {
            System.out.print(j);
        }
        // printing new line for each row
        System.out.println();
    }
}
//-------------------------------------------Diamond pattern---------------------------------------------//
public static void printPattern3(int n3)
{
    int i, j;
    int num = 1;
    // outer loop to handle upper part
    for (i = 1; i <= n3; i++) {
        // inner loop to print spaces
        for (j = 1; j <= n3 - i; j++) {
            System.out.print(" ");
        }
        // inner loop to print stars
        for (j = 1; j <= 2 * i - 1; j++) {
            System.out.print(i);
        }
        System.out.println();
    }

    // outer loop to handle lower part
    for (i = n3-1; i >= 1; i--) {
        // inner loop to print spaces
        for (j = 1; j <= n3 - i; j++) {
            System.out.print(" ");
        }
        // inner loop to print stars
        for (j = 1; j <= 2 * i - 1; j++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
//--------------------------------------Butterfly pattern---------------------------------------------------//
public static void printPattern4(int n4)
    {
        int i, j;
        int num = 1;
 
        // outer loop to handle upper part
        for (i = 1; i <= n4; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
 
            // inner loop to print spaces
            int spaces = 2 * (n4 - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
 
            System.out.println();
        }
 
        // outer loop to handle lower part
        for (i = n4; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
 
            // inner loop to print spaces
            int spaces = 2 * (n4 - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
 
            System.out.println();
        }
    }
//--------------------------------------Triangle Star pattern-----------------------------------//
public static void printPattern5(int n5)
{
    int i, j;
    // outer loop to handle rows
    for (i = 0; i < n5; i++) {
        // inner loop to print spaces.
        for (j = n5 - i; j > 1; j--) {
            System.out.print(" ");
        }

        // inner loop to print stars.
        for (j = 0; j <= i; j++) {
            System.out.print(j+1);
        }

        // printing new line for each row
        System.out.println();
    }
}
//-------------------------------------Palindrome Triangle----------------------------------------//
public static void printPattern6(int n6)
    {
        int i, j;
 
        // outer loop to handle number of rows
        for (i = 1; i <= n6; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n6 - i); j++) {
                System.out.print(" ");
            }
 
            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
 
            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
 
            // printing new line for each row
            System.out.println();
        }
    }


    //--------------------------------------MAIN FUNCTION------------------------------------------//
    public static void main(String[] args) {
    

        System.out.print("1.Hollow Square \n2.Rhombus \n3.Diamond \n4.Butterfly \n5.Triangle Star \n6.Palindrome Triangle");
        System.out.print("\n Enter a number to generate pattern: ");
        Scanner myObj = new Scanner(System.in);
        int options = myObj.nextInt();

    switch (options) {
        case 1:
        int n1 = 6;
        printPattern1(n1);    
            break;
        
        case 2:
        int n2 = 6;
        printPattern2(n2);    
            break;
        
        case 3:
        int n3 = 6;
        printPattern3(n3);    
            break;
    
        case 4:
        int n4 = 6;
        printPattern4(n4);    
            break;

        case 5:
        int n5 = 6;
        printPattern5(n5);    
            break;
        case 6:
        int n6 = 6;
        printPattern6(n6);    
            break;
    


        default:
            break;
    }

    }
    
}