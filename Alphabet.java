import hsa.Console;
import java.util.*;
public class Alphabet
{ static Console c;
  public static void main(String[] args)
  { c = new Console();
    //creating one array
    String[] alphabet = new String[10];
    String answer;  
    String search;
    //display the array
    c.println("Original alphabet array");
    for(int x = 0; x < 10; x++)
    {
      alphabet[x] = c.readLine();

    }
    c.println("Here is the alphabet after sorting in ascending order:");
    Arrays.sort(alphabet); //sort the array in ascending (alphabetical) order
    //display array
    for(int x = 0; x < 10; x++)
    {
      c.println(alphabet[x]);
    }
    c.println("Here is the alphabet after sorting in descending order:");
    Arrays.sort(alphabet, Collections.reverseOrder()); //sort in descending (reverse alphabetical) order
    
     //displays the array after reversing the order 
    for(int x = 0; x < 10; x++)
    {
      c.println(alphabet[x]);
    }
    }
  }

