//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
       long  max=a[0];
       long  min=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            max=a[i];
            if(min>a[i])
              min=a[i];
        }
         return new pair(min,max);
    }
}
