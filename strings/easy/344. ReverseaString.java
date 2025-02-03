import java.util.Arrays;

public class ReverseaString {
    public void reverseString(char[]s){
        int left = 0, right =s.length-1 ;
        while(left<right){
            //swapping charaters from the character array
            char temp = s[left] ;
            s[left] = s[right] ;
            s[right] = temp;

            //increment and decrement pointers
            right --;
            left ++ ;
        }
    }

    public static void main(String[] args) {
        ReverseaString sol = new ReverseaString();

        //eg 1
        char[] s1 = {'h','e','l','l','o'};
        sol.reverseString(s1);
        System.out.println(Arrays.toString(s1));

        //eg 1
        char[] s2 = {'t','a','a','r','i','q'};
        sol.reverseString(s2);
        System.out.println(Arrays.toString(s2));
    }
    
}
