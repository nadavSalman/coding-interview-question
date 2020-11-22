package coding.interview.question.question1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[Start Question1 driver]~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("connect two number with the same digit length ");
        List<Integer> num1 = new LinkedList<>();
        num1.add(6);
        num1.add(9);
        num1.add(9);
        Iterator num1Iterator = num1.iterator();
        String num1Str = " -> ";
        while (num1Iterator.hasNext()){num1Str += num1Iterator.next().toString()+  " -> ";}
        System.out.println(num1Str);

        List<Integer> num2 = new LinkedList<>();
        num2.add(6);
        num2.add(9);
        num2.add(9);
        Iterator num2Iterator = num2.iterator();
        String num2Str = " -> ";
        while (num2Iterator.hasNext()){num2Str += num2Iterator.next().toString()+  " -> ";}
        System.out.println(num2Str);


        Solution solution = new Solution(num1,num2);
        System.out.println(solution.solve());

        List<Integer> res = new LinkedList<>();
        res.add(3);
        res.add(4);
        res.add(9);
        res.add(1);

        System.out.println("->>>"+solution.compateTwoNumberList(num1,num2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~[End Question1 driver]~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
