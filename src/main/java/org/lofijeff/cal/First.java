package org.lofijeff.cal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class First {

  private String currentLine;
  private int sum, currentNumber;

  public int getPassword() {
    File textFile = new File("../pw.txt");
    currentNumber = 50;

    try (Scanner scan = new Scanner(textFile);) {
      while (scan.hasNextLine()) {
        currentLine = scan.nextLine();

        if (currentLine.startsWith("L")) {
          String numberString = currentLine.substring(1);
          int number = Integer.parseInt(numberString);

          for (int i = 0; i < number; i++) {
            currentNumber = (currentNumber - 1);
            if (currentNumber < 0) {
              currentNumber = 99;
            }
          }

          if (currentNumber == 0) {
            sum++;
          }

        } else if (currentLine.startsWith("R")) {
          String numberString = currentLine.substring(1);
          int number = Integer.parseInt(numberString);

          for (int i = 0; i < number; i++) {
            currentNumber = (currentNumber + 1);

            if (currentNumber > 99) {
              currentNumber = 0;
            }
          }

          if (currentNumber == 0) {
            sum++;
          }
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Oh shit");
      e.printStackTrace();
    }
    return sum;
  }
}
