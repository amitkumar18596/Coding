public class isPalindrome {
    public boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);
        int n=str.length();
        String rev="";

        for(int i=n-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
            return true;
        else 
            return false;
}
