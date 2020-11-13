package coding.interview.question.question1;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
/**
 *
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Understandink the question :
 * linked lists move in one direction
 *
 *
 *
 */
public class Solution {

    private List<Integer>  mNum1;
    private List<Integer>  mNum2;
    private List<Integer> res;

    /**
     * Create new instance to solve the problem with the two parameters to sum .
     * @param num1 List<Integer> first number
     * @param num2 List<Integer> second number
     */
    public Solution(List<Integer> num1, List<Integer> num2){
        this.mNum1 = num1;
        this.mNum2 = num2;
        this.res = new LinkedList<>();
    }

    /**
     * Created for unit Tests purposes
     */
    public Solution() {
        this.mNum1 = new LinkedList<>();
        this.mNum2 = new LinkedList<>();
        this.res = new LinkedList<>();
    }

    public int unitySum(int unit, int num1Digit, int num2Digit,int savedToAdd){
        int multiplyBy = (int)(unit / 10);
        return (num1Digit * multiplyBy) + (num2Digit * multiplyBy) + (savedToAdd * multiplyBy) ;
    }


    public List<Integer> solve(){
        Iterator num1Iterator = this.mNum1.iterator();
        Iterator num2Iterator = this.mNum2.iterator();

        int unityCounter = 10 , sum = 0 , saveToNextIteration = 0 , currentDigitToWrite = 0;

        while (num1Iterator.hasNext() && num2Iterator.hasNext()){
            sum = unitySum(unityCounter,(int)num1Iterator.next(),(int)num2Iterator.next(),saveToNextIteration);
            System.out.println(sum);
            currentDigitToWrite = sum % unityCounter;
            while (currentDigitToWrite >= 10) currentDigitToWrite = currentDigitToWrite / 10;//to resolve the most left digit .


            saveToNextIteration = sum / unityCounter;

            this.res.add(currentDigitToWrite);

            unityCounter = unityCounter * 10;
        }





        if (num1Iterator.hasNext()){
            while (num2Iterator.hasNext()){
                sum = unitySum(unityCounter,(int)num1Iterator.next(),0,saveToNextIteration);
                System.out.println(sum);
                currentDigitToWrite = sum % unityCounter;
                while (currentDigitToWrite >= 10) currentDigitToWrite = currentDigitToWrite / 10;//to resolve the most left digit .

                saveToNextIteration = sum / unityCounter;

                this.res.add(currentDigitToWrite);

                unityCounter = unityCounter * 10;
            }
        }

        if (num2Iterator.hasNext()){
            while (num2Iterator.hasNext()){
                sum = unitySum(unityCounter,0,(int)num2Iterator.next(),saveToNextIteration);
                System.out.println(sum);
                currentDigitToWrite = sum % unityCounter;
                while (currentDigitToWrite >= 10) currentDigitToWrite = currentDigitToWrite / 10;//to resolve the most left digit .

                saveToNextIteration = sum / unityCounter;

                this.res.add(currentDigitToWrite);

                unityCounter = unityCounter * 10;
            }

        }

        while (saveToNextIteration >= 10) saveToNextIteration = saveToNextIteration / 10;
        if(saveToNextIteration != 0)
            this.res.add(saveToNextIteration);


        return res;

    }

    public List<Integer> getmNum1() {
        return mNum1;
    }

    public void setmNum1(List<Integer> mNum1) {
        this.mNum1 = mNum1;
    }

    public List<Integer> getmNum2() {
        return mNum2;
    }

    public void setmNum2(List<Integer> mNum2) {
        this.mNum2 = mNum2;
    }

    public List<Integer> getRes() {
        return res;
    }



    public int convertListToInteger(List<Integer> num){
        int numberConverted = 0;
        Iterator numIterator = num.iterator();
        while (numIterator.hasNext()){
            numberConverted += (int) numIterator.next();
        }
        return numberConverted;
    }

    public boolean compateTwoNumberList(List<Integer> num1, List<Integer> num2){
        if(num1.size() != num2.size())
            return false;

        Iterator num1Iterator = num1.iterator();
        Iterator num2Iterator = num2.iterator();
        while (num1Iterator.hasNext() && num2Iterator.hasNext()){
            if(((int)num1Iterator.next()) != ((int)num2Iterator.next()))return false;
        }

        return true;
    }




}
