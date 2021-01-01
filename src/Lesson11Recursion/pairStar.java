
package Lesson11Recursion;

import java.util.ArrayList;


public class pairStar {


    private ArrayList<String> in, out;
    private String id;
    public static void main(String[] args) {
        ArrayList<String>testdata = new ArrayList();
        ArrayList<String>expected = new ArrayList();
        testdata.add("hello");
        testdata.add("xxyy");
        testdata.add("aaab");
        testdata.add("aa");
        expected.add("hel*lo");
        expected.add("x*xy*y");
        expected.add("a*a*a*a");
        expected.add("a*a");
        pairStar prob = new pairStar(testdata,expected,"PairStar");
        prob.solve();
    }
    
    pairStar(ArrayList<String>i,ArrayList<String>o,String inid){
        in =i;
        out = o;
        id = inid;
    }
    
    public String pairStar(String str) {
        //stopping state 
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }

    }
    
    public void solve(){
        for (int i = 0; i < in.size(); i++) {
            System.out.print(id + "(" + in.get(i) + ") ->");
            System.out.print(out.get(i) + "\tResults: ");
            String result = pairStar(in.get(i));
            System.out.print(result + "\t\t");
            //System.out.println("Expected: " + out.get(i) + " Result: " + result);
            if(result.equals(out.get(i))){
                System.out.println("ok");
            }
            else
                System.out.println("FAIL");
        }
    }
    
}
