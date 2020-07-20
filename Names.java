import hsa.Console;
import java.util.*;
public class Names
{ static Console c;
  public static void main(String[] args)
  { c = new Console();
    //creating one arrays
    String[] names = new String[10];
    String answer; //This integer is for inputting temperatures 
    String search;
    //display array
    c.println("Original names array");
    for(int i = 0; i < 10; i++)
    {
      names [i] = c.readLine();
    }
    c.println("Here are the names after sorting:");
    Arrays.sort(names); //sort the array in ascending (alphabetical) order
    //display array
    for(int i = 0; i < 10; i++)
    {
      c.println(names[i]);
    }
    c.println("Here are the names in descending order:");
    Arrays.sort(names, Collections.reverseOrder()); //sort in descending (reverse alphabetical) order
    
     //displays the array after reversing the order 
    for(int i = 0; i < 10; i++)
    {
      c.println(names[i]);
    }
    }
  }
