/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
import java.lang.*;
public class PaintCalc {
    public static void main(String []args){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length and width of the ceiling in feet");
        float length = st.nextFloat();
        float width = st.nextFloat();
        float area = length * width;
        int result = (int) Math.ceil(area / 350);
        System.out.printf("You will need to purchase "+result+" gallons of paint to cover %.0f square feet", area);
    }
}
