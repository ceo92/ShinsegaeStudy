package assignment._0709_exception.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob1 {

  public static void main(String args[]) {

    Prob1 prob1 = new Prob1();

    System.out.println( prob1.leftPad("SSG", 6, '#') );
    System.out.println( prob1.leftPad("SSG", 5, '$') );
    System.out.println( prob1.leftPad("SSG", 2, '&') );

  }

  public String leftPad(String str, int size, char padChar) {
    int i=str.length();
    StringBuilder sb = new StringBuilder();
    while (i++ < size){
      sb.append(padChar);
    }
    sb.append(str);
    /*  여기에 프로그램을 완성하십시오. */
    return sb.toString();
  }

}