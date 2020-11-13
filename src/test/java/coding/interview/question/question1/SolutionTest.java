package coding.interview.question.question1;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {


    public static Solution solution;
    public static List<Integer> num1;
    public static List<Integer> num2;



    @BeforeEach
    public  void beforeAll(){
        num1 = new LinkedList<>();
        num2 = new LinkedList<>();
        solution = new Solution(num1,num2);
    }


    @Test
    public void  twoNumbersInTheSameLengthTest(){
        List<Integer> num1 = new LinkedList<>();
        num1.add(5);
        num1.add(6);
        num1.add(9);
        List<Integer> num2 = new LinkedList<>();
        num2.add(4);
        num2.add(9);
        num2.add(1);
        solution.setmNum1(num1);
        solution.setmNum2(num2);
        List<Integer> resExpected = new LinkedList<>();
        resExpected.add(9);
        resExpected.add(5);
        resExpected.add(1);
        resExpected.add(1);
        List<Integer> res = solution.solve();
        System.out.println(res);
        assertTrue(solution.compateTwoNumberList(res,resExpected));
    }

    @Test
    public void  twoNumbersInWithDifferentLengthTest(){
        List<Integer> num1 = new LinkedList<>();
        num1.add(5);
        num1.add(6);
        List<Integer> num2 = new LinkedList<>();
        num2.add(4);
        num2.add(9);
        num2.add(1);
        solution.setmNum1(num1);
        solution.setmNum2(num2);
        List<Integer> resExpected = new LinkedList<>();
        resExpected.add(9);
        resExpected.add(5);
        resExpected.add(2);
        List<Integer> res = solution.solve();
        System.out.println(res);
        assertTrue(solution.compateTwoNumberList(res,resExpected));
    }







}
