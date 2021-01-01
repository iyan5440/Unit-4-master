
package Lesson11Recursion;




public class simpsons {


    static String start[] = {"Simpsons in Cave", "Lisa trapped with Burns", "Burns at Moe's","Moe with Edna","Enda in School"};
    static String end[] = {"Simpsons leave Cave", "Lisa take picture with Burns", "Burns gets gold","Moe puts gold in machine","Edna stays on as teacher"};
   
    
    public static void story(int n){//for simpsons
        System.out.println( start[n]+ "");
        if(n< start.length-1){
            story(n+1);
        }
        System.out.println(end[n]);
    }
     public static void main(String[] args) {

        story(0);
    }
    
}
