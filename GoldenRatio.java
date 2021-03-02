package package_3;

import java.math.*;

public class GoldenRatio
   {

      // Creating table characters
      private static final char PIPE = '|';
      private static final char DASH = '-';
      private static final char DOUBLE_DASH = '=';
      private static final String PIPE_SPACE = "| ";
      private static final String SPACE_PIPE = " |";
      private static final String SPACE_PIPE_SPACE = " | ";
      
      // Table values
      private static final int TABLE_WIDTH = 60;
      private static final int LEFT_COLUMN_WIDTH = 40;
      private static final int RIGHT_COLUMN_WIDTH = 17;
      
      // Constants for ratio computation
      private static final double GOLDEN_RATIO_INVERSE = (Math.sqrt(5)-1) / 2;
      private static final int PRECISION = 3;
      
      // Necessary numbers
      private static final int TITLE_WIDTH = 51;
      private static final int TWO_ENDLINES = 2;
      private static final int TWO_SPACES = 2;
      private static final int TWO_PIPES = 2;
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            // Declare and initialize variables
            Console_IO_Class conIO = new Console_IO_Class();
            double length, longPart, shortPart;
            
            // Show title and thick line
            // Method: printString, printEndline, printChars
            conIO.printString("COMPUTE GOLDEN RATIO PART OF LINE WITH GIVEN LENGTH");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH, DOUBLE_DASH);
            
            conIO.printEndlines(TWO_ENDLINES);
            
            // Get input from user
            // Method: promptForDouble
            length = conIO.promptForDouble("Enter length of line: ");
            
            conIO.printEndline();
            
            // Calculate the long part
            longPart = calcLongPart(length);
            
            // Calculate the short part
            shortPart = calcShortPart(length, longPart);
            
            // Display results
            displayResult(longPart, shortPart);
            
         // end main
         }

      public static double calcLongPart(double length)
         {
            double longPart;
            
            longPart = length * GOLDEN_RATIO_INVERSE;
            
            return longPart;
         
         }
      
      public static double calcShortPart(double length, double longPart)
         {
            double shortPart;
            
            shortPart = length - longPart;
            
            return shortPart;
            
         }
      
      public static void displayResult(double longPart, double shortPart)
         {
            Console_IO_Class conIO = new Console_IO_Class();
            
            // Table
            // Top border
            conIO.printChar(PIPE);
            conIO.printChars(TABLE_WIDTH - TWO_PIPES, DOUBLE_DASH);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // First row
            conIO.printString(PIPE_SPACE);
            conIO.printString("Long Part", LEFT_COLUMN_WIDTH - TWO_SPACES, "LEFT");
            conIO.printString(SPACE_PIPE_SPACE);
            conIO.printDouble(longPart, PRECISION, RIGHT_COLUMN_WIDTH - TWO_SPACES, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printChars(LEFT_COLUMN_WIDTH, DASH);
            conIO.printChar(PIPE);
            conIO.printChars(RIGHT_COLUMN_WIDTH, DASH);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // Second row
            conIO.printString(PIPE_SPACE);
            conIO.printString("Short Part", LEFT_COLUMN_WIDTH - TWO_SPACES, "LEFT");
            conIO.printString(SPACE_PIPE_SPACE);
            conIO.printDouble(shortPart, PRECISION, RIGHT_COLUMN_WIDTH - TWO_SPACES, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printChars(TABLE_WIDTH - TWO_PIPES, DOUBLE_DASH);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // End Program
            conIO.printEndline();
            conIO.printString("End Program");
         }
   }
