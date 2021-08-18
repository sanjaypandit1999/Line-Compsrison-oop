package com.bridglabz;

public class Linecomparison {
        public static void main(String[] args) {
            System.out.println("Enter coordinate of line-1");
            CalLine length = new CalLine();
            double length1 = length.calLength();
            System.out.println("Enter coordinate of line-2");
            CalLine diff = new CalLine();
            double length2 = diff.calLength();
            System.out.println("Length of Line-1 = " + length1 + "\n"
                    + "Length of Line-2 = " + length2);
            CalLine compare = new CalLine();
            double com = compare.comparisonTo(length1, length2);
            System.out.println(com);
        }
}
