import java.util.*;

public class soal1m3 {
  public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
    	String userInput;
    	userInput= keyboard.nextLine();
    	String[] temp = userInput.split("\\ |!|,|\\?|\\.|\\_|\\@|'");
    	System.out.println(temp.length);
    	userInput=userInput.replaceAll("\\'","\n");
    	userInput=userInput.replaceAll(" ","\n");
    	System.out.println(userInput);
    	
  }
}