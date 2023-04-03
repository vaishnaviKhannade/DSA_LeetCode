//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java
//import java.util.*;

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M){
            return -1;
        }
        int res=-1;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
            if(max<A[i]){
                max=A[i];
            }
            sum+=A[i];
        }
        
        int start=max, end=sum;
        
        while(start<=end){
            int mid=start+((end-start)/2);
            if(isValid(A, N, M,mid )==true){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    
    static boolean isValid(int arr[],int N, int M,int mid){
        int student=1;
        int sum=0;
        for(int i=0;i<N;i++){
          
           // if(sum<mid){
             sum+=arr[i];           
          //  }
            if(sum>mid){
                 student++;
                sum=arr[i];
            }
            if(student>M){
                return false;
            }
        }
        return true;
    }
    
    
    
    
    
};