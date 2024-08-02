class Solution {
    public String toLowerCase(String s) {
        String s1 ="";
           for(int i=0;i<s.length();i++)
           {
            if(s.charAt(i) <94 || s.charAt(i) >64)
            {
                s1 += (char)(s.charAt(i) +32);
            }
            else{
                s1+= s.charAt(i);
            }
           }
           return s1;
    }
    StringBuilder ss = new StringBuilder();
    ss.DeletecharAt(ss.length() -1);
}