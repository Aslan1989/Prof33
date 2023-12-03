package leetcodeTasks;

public class Task2IsPalindrome {
    public static void main(String[] args) {

        System.out.println(
                isPalindrome(123)
        );
        
    }
    public static boolean isPalindrome(int x)
    {
        if (x < 0){
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp!=0){
            int digit =(int) (temp %10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);

    }

}
