package assignment._0709_exception.prob2;


public class Prob1 {

  public static void main(String[] args) {
    System.out.println("문자열에 특정문자 변경하는 테스");
    System.out.println("-------------Sample 1 --------------");
    String str1=myReplace("hello world",'l','*');
    System.out.println(str1);

    System.out.println("-------------Sample 2 --------------");
    String str2=myReplace("hello world",' ','-');
    System.out.println(str2);

    System.out.println("-------------Sample 3 --------------");
    String str3=myReplace("hello world",'a','*');
    System.out.println(str3);


  }

  public static String myReplace(String str, char oldChar, char newChar){
    // 이 부분을 구현하시오.
    char[] charArray = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char c : charArray) {
      if (c == oldChar) {
        sb.append(newChar);
      }
      else{
        sb.append(c);
      }
    }
    return sb.toString();

  }

}