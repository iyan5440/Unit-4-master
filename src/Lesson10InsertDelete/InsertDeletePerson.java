
package Lesson10InsertDelete;

import static Lesson10InsertDelete.InsertDeleteFruit.logicalSize;
import java.util.Scanner;


public class InsertDeletePerson {


    static int logicalSize =1;
    public static void main(String[] args) {
        //Person peeps[] = new Person[]{("Andy","male",23),("Cindy","female",31),("Fred","male",54),("Sue","female",19),("","",0),("","",0),("","",0),("","",0),("","",0),("","",0)};
        Person peeps[] = new Person[10];
        peeps[0] = new Person("Andy","male",23);
        peeps[1] = new Person("Cindy","female",31);
        peeps[2] = new Person("Fred","male",54);
        peeps[3] = new Person("Sue","female",19);
        logicalSize = 4;
        System.out.println("Inserting Joe");
        //where does it go?
        Person p = new Person("Joe","male",23);
        int loc = findInsertPoint(peeps,p);
        System.out.println("Joe will be inserted at " + loc);
        insert(peeps,p,loc);
        showPerson(peeps);
        System.out.println("Inserting Jessica and Mary");
        p = new Person("Jessica","female",13);
        loc = findInsertPoint(peeps,p);
        insert(peeps,p,loc);
        p = new Person("Mary","female",33);
        loc = findInsertPoint(peeps,p);
        insert(peeps,p,loc);
        showPerson(peeps);
        //////////////////TESTING DELETE////////////////////
        Scanner s = new Scanner(System.in);
        String f;
        while (true) {            
            System.out.print("Enter Fruit to delete, ot \"q\" to quit ");
            f = s.nextLine();
            if(f.equals("q")) break;
            //find fruit in list
            loc = search(peeps,f);
            if(delete(peeps,loc)==false) System.out.println("Could not delete - " + f + " not found.");
            else System.out.println(f +" was removed");
            showPerson(peeps);
        }
        
    }
    
    public static void showPerson(Object arr[]){
        System.out.println("--------------------------------");
        for (int i = 0; i < logicalSize; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n-----------------------------\n");
    }
    //search is needed to find an item to delete - need to know its location
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = logicalSize-1;
	   while (left <= right){
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
    }

    
    //call find insert point first to get target index, then send it into here.
    //////////////////////////////////////////////////////////////////////////////////

    public static boolean insert(Object array[], Object newItem, int targetIndex)
    {
            // Check for a full array and return false if full
            if (logicalSize == array.length)
               return false;
            // Check for valid target index or return false 
            if (targetIndex < 0 || targetIndex > logicalSize)
               return false;
            // Shift items down by one position
            for (int i = logicalSize; i > targetIndex; i--)      
               array[i] = array[i - 1];
            // Add new item, increment logical size,return true                       
            array[targetIndex] = newItem; 
            logicalSize++;
            return true; 
    }

    //before calling delete, must search for item first and send that result 
    //////////////////////////////////////////////////////////////////////////////////

    public static boolean delete(Object array[], int targetIndex)
    {
            if (targetIndex < 0 || targetIndex >= logicalSize)
                       return false;

                    // Shift items up by one position
                    for (int i = targetIndex; i < logicalSize - 1; i++)       
                       array[i] = array[i + 1];

                    // Decrement logical size and return true 
                    logicalSize--; 
                    return true;                                   
    }
    
    //call this before inserting new item
    //very similar to search, but we are looking for a location for a new item

    /////////////////////////////////////////////////////////////////////////////////

    public static int findInsertPoint (Object a[], Object searchValue){
               int left = 0;
               int right = logicalSize-1;
               int midpoint=0;

               while (left <= right){
                  midpoint = (left + right) / 2;

                  int result = ((Comparable)a[midpoint]).compareTo(searchValue); 

                 if (result < 0)
                     left = midpoint + 1;
                  else
                     right = midpoint-1;
               }
               if(((Comparable)a[midpoint]).compareTo(searchValue) < 0)
               midpoint++;
               return midpoint;	   
    }
}

    

