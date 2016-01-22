package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class MyCalculator
{
  public static void main(String[] args)
  {
    int num1 = MessageBox.askForNumericalInput("Please enter the first number");
    MessageBox.showMessage("You entered: " + num1);
    int num2 = MessageBox.askForNumericalInput("Please enter the second number");
    MessageBox.showMessage("You entered: " + num2);
    int sum = add(num1, num2);
    int difference = subract(num1, num2);
    int product = multiply(num1, num2);
    MessageBox.showMessage("The sum of your number is: " + sum);
    MessageBox.showMessage("The difference of your number is: " + difference);
    MessageBox.showMessage(num1 + "X" + num2 + "=" + product);
    int quotient = divide(num1, num2);
    if (quotient == -1) { return; }
    MessageBox.showMessage(num1 + "/" + num2 + "=" + quotient);
    int answer = pow(num1, num2);
    MessageBox.showMessage(num1 + " to the power of" + num2 + "=" + answer);
  }
  public static int add(int n1, int n2)
  {
    return n1 + n2;
  }
  public static int subract(int n1, int n2)
  {
    return n1 - n2;
  }
  public static int multiply(int n1, int n2)
  {
    return n1 * n2;
  }
  public static int divide(int n1, int n2)
  {
    if (n2 == 0)
    {
      MessageBox.showMessage("Error. Division by 0");
      return -1;
    }
    else
      return n1 / n2;
  }
  public static int pow(int base, int exp)
  {
    int answer = 1;
    for (int i = 0; i < exp; i++)
    {
      answer = answer * base;
    }
    return answer;
  }
}
