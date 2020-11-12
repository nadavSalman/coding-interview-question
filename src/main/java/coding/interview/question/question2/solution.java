package coding.interview.question.question2;
class Solution {///need to test for overflow? "-91283472332"
    public static int myAtoi(String s) {
        System.out.println("enter string");
        int sum = 0, sig = 1;
        char curr;
        boolean firstchar = false;
        for (int i = 0; i < s.length(); i++) {
            curr=s.charAt(i);
            if(firstchar)
            {
                if((curr<='9')&&(curr>='0'))
                {
                    sum*=10;
                    sum+=(int)curr-(int)'0';
                }
                else
                    break;
            }
            else {
                if(curr==' ')
                    continue;
                else if((curr=='-')||(curr=='+'))
                {
                    if(curr=='-')
                        sig=-1;
                }
                else if((curr<='9')&&(curr>=0))
                {
                    sum*=10;
                    sum+=(int)curr-(int)'0';
                }
                else
                    break;
                firstchar=true;
            }
        }
        return sum*sig;
    }

    public static  void main(String[] args)
    {
        int num;
        System.out.println("enter string2");
            num=myAtoi("-91283472332");
        System.out.println(num);
    }

}
