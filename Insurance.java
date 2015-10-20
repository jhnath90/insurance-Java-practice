import java.io.Console;

public class Insurance {
  public static void main(String[] args) {
  	Console console = System.console();

    System.out.println("What is your gender?");
    String gender = console.readLine();

  	System.out.println("How old are you?");
  	String stringAge = console.readLine();
  	Integer age = Integer.parseInt(stringAge);

  	Boolean young = age <= 26;
  	Boolean male = gender == "male";

  	 if (young || male) {
      System.out.println("Your insurance is going to be expensive!");
  	} else {
  	  System.out.println("Your insurance is going to be kind of expensive but it could be worse!");
  	}
  }
}