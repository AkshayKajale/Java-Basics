class Solution {
    
    public int assignedValue(char r)
        {
          if(r == 'I')
          {
              return 1;
          }
        if(r == 'V')
          {
              return 5;
          }
        if(r == 'X')
          {
              return 10;
          }
        if(r == 'L')
          {
              return 50;
          }
        if(r == 'C')
          {
              return 100;
          }
        if(r == 'D')
          {
              return 500;
          }
        if(r == 'M')
          {
              return 1000;
          }
        return 0;
        }
    
    public int romanToInt(String s) {
        
        int romanSum=0,s1=0,s2=0;
         
        for(int i=0;i<s.length();i++)
        {
             s1 = assignedValue(s.charAt(i));
            
            if(i+1<s.length())
            {
                s2 = assignedValue(s.charAt(i+1));
            
            
            if(s1>=s2)
            {
                romanSum = romanSum+s1;
            }
            else
            {
                romanSum = romanSum + s2-s1;
                i++;
            }
            } 
            else
            {
                romanSum = romanSum+s1;
            }
                
               
    }      
     return romanSum;
    }
}
