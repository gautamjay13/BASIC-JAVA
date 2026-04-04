public class reversestring {
    public static void main(String[] args) {
        String str = "madam";
        int i = 0;
        int j = str.length() - 1;
        boolean ispalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                ispalindrome = false;
                break;
            }
             i++;
            j--;
            }
            if (ispalindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
           
        }
    }
}
