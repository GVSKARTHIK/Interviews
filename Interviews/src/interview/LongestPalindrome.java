package interview;

public class LongestPalindrome {
	
	    public String longestPalindrome(String s) {
	    	 
	        
	       int n = s.length();
	        
	        if(n == 0){
	            return "";
	        }
	        if(n==1){
	            return s;
	        }
	        String result = s.substring(0, 1);
	       
	        for(int i = 0; i< n; i++) {
	            for(int j = i+1; j< n; j++){
	                
	                if(isPalindrome(s.substring(i, j+1))){
	                    if(result.length() < s.substring(i,j+1).length()){
	                        result = s.substring(i,j+1);
	            
	                    }
	                }
	                          
	            }
	        }
	        return result;
	        
	    }
	    
	    public boolean isPalindrome(String s){
	      int i = 0; 
	      int n = s.length()-1;
	      while(i<n){
	          if(s.charAt(i) != s.charAt(n)) return false;
	          n--;
	          i++;
	      }
	        return true;
	    }
	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		//lp.longestPalindrome("cbbd");
		System.out.println(lp.longestPalindrome("ac") + "    result");

	}

}
