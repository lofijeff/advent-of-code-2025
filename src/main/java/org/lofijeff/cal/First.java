package org.lofijeff.cal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class First {

  private String currentLine, nextLine;
  private int sum, currentNumber, nextNumber;

  public int getPassword() {
    File textFile = new File("../pw.txt");
    currentNumber = 50;

    try (Scanner scan = new Scanner(textFile);) {
      while (scan.hasNextLine()) {
        currentLine = scan.nextLine();

        if (currentLine.startsWith("L")) {
          String numberString = currentLine.substring(1);

          int number = Integer.parseInt(numberString);
          currentNumber = currentNumber - number;

          System.out.println(currentNumber);

        } else if (currentLine.startsWith("R")) {

          System.out.println("He finns RRRR");
        }

        System.out.println(currentLine);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Oh shit");
      e.printStackTrace();
    }

    return 3;

  }
}
