package coding.interview.question.question1;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitySumTest {
    public static Solution solution;

    @BeforeAll
    public static void beforeAll(){
         solution = new Solution();
    }

    @Test void lowerBoundaryTest(){
        assertEquals(solution.unitySum(10,7,6,0),14);//expect to return 7 * (10/10) +  5 * (10/10) + 0 * (10/10) = 7+ 5 + 0 = 13
    }

    @Test
    public  void middleBoundaryTest(){
        assertEquals(solution.unitySum(100,4,9,1),140);//expect to return 40 + 90 + 10 = 140
    }

    @Test
    public  void middleBoundaryWithZeroSavedTest(){
        assertEquals(solution.unitySum(100,4,9,0),130);//expect to return 40 + 90 + 0 = 130
    }








}
