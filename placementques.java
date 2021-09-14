// if k is present in every 3 consecutive elements in an array then print 1 other wise return 0.
public class MyClass {
    public static void main(String args[]) {
    int n=15;
    int[] a={5,6,3,5,7,2,3,9,8,3,0,6,3,5,4,3};
    int f=0;
    int j=0,k=3,check=0;
    for(int i=0;i<n;i++)
    {   
        
        if(a[i]==k)
        f=1;
        if((i+1)%3==0 && f==0){
         System.out.print("0");
         check=1;
            break;
        }
        if((i+1)%3==0 && f==1 && i!=n-1)
        f=0;
    }
    if(f==1)
     System.out.print("1");
     else if(check==0)
     System.out.print("0");
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//cipher encrpyt the given code into a code as follows

public class MyClass {
    public static void main(String args[]) {
    String s="biwi";
    String temp="";
    int x=0;
    for(int i=0;i<s.length();i++)
    {
       x=s.charAt(i);
       x=x+5;
      if(x>122)
      {
         x=96+x%122;
      }
      temp=temp+(char)(x);
    }
    
    System.out.print(temp);
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
