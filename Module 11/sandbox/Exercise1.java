package sandbox;

public class Exercise1 {
    //palindrome means same forward as backwards 

//skip non-letter characters from the left 
public static boolean isPalindrome(String s, int left, int right){
    while (left < right && !Character.isLetter(s.charAt(left))){
        left++;
    }
//skip non-letter characters from the right 
    while (left<right && !Character.isLetter(s.charAt(right))){
        right++;
    }

//compare characters ignoring upper/lowercase
if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
    return false;
}

//base case 
if (left >= right){
    return true;
}

//recursive case 
return isPalindrome(s, left+1, right-1);
}
    public static void main(String[] args) {
    String x = "racecar";
    String y = "Michelle";
    System.out.println(isPalindrome(x, 0, x.length()-1));
    System.out.println(isPalindrome(y, 0, y.length()-1));
}
}