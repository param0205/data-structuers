//Check for Binary 
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Maximum Occuring Character
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] ch=new int [26];
        for(int i=0;i<line.length();i++)
        {
            int c=(int)line.charAt(i);
            c=c-97;
            ch[c]++;
        }  int max=0;int j=0;
        for(int i=0;i<26;i++)
        {
            if(ch[i]>max){
            max=ch[i];
            j=i+97;}
        }
        return (char)j;
    }
    
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int n=s.length();
       int m=x.length();
       int i=0;
       for(i=0;i<=n-m;i++)
       {   int j=0;
           for(j=0;j<m;j++)
           {
               if(s.charAt(i+j)!=x.charAt(j))
               break;
           }
           if(j==m)
           return i;
       }
       return -1;
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// Longest Substring Without Repeating Characters 

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        String s = br.readLine();
	        Solution T = new Solution();
	        System.out.println(T.SubsequenceLength(s));
	        
            t--;
	    }
	}
    
}



// } Driver Code Ends


//User function Template for Java


class Solution
{
    

    int SubsequenceLength(String s) 
    {
        // Code here  
        String s1=s;
        int t=0,c=1,max=0;
        for(int i=1;i<s.length();i++)
        {
            int j=i;
            while(j>t)
            {
                if(s.charAt(i)==s1.charAt(j-1)){
                t=j;
                break;}
                else
                c++;
                j--;
            }
            if(c>max)
            max=c;
            c=1;
        }
        return max;
    }
    
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
