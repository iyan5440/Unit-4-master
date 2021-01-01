
package Lesson11Recursion;

import java.util.ArrayList;
import java.util.Arrays;


public class Array11 {


    private ArrayList<int[]> in;
    private ArrayList<Integer> out;
    private String id;
    
    public static void main(String[] args) {
        ArrayList<int[]>testdata = new ArrayList();
        ArrayList<Integer>expected = new ArrayList();
        testdata.add(new int[]{1,2,11});
        testdata.add(new int[]{11,11});
        testdata.add(new int[]{1,2,3,4});
        testdata.add(new int[]{1,11,3,11,11});
        testdata.add(new int[]{11});
        expected.add(1);
        expected.add(2);
        expected.add(0);
        expected.add(3);
        expected.add(1);
        Array11 prob = new Array11(testdata,expected,"array11");
        prob.solve();
    }
    
    Array11(ArrayList<int[]> i, ArrayList<Integer> o,String inid){
        in =i;
        out = o;
        id = inid;
    }
    
    
    
    public void solve(){
        for (int i = 0; i < in.size(); i++) {
            System.out.print(id +"(" + Arrays.toString(in.get(i)));
            //System.out.print(id + "(" + in.get(i) + ") ->");
            System.out.print(/*out.get(i) +*/ "\tResults: ");
            int result = array11(in.get(i),0);
            System.out.print(result + "\t\t");
            //System.out.println("Expected: " + out.get(i) + " Result: " + result);
            if(result ==(out.get(i))){
                System.out.println("ok");
            }
            else
                System.out.println("FAIL");
        }
    }
    
    public int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        } else {
            return 0 + array11(nums, index + 1);
        }
    }
    
}
