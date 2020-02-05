#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    long N,i,j,sum=0,a[100000],b[100000];
    cin>>N;
    for(i=0;i<N;i++)
    { cin>>a[i];}
    for(j=1;j<N;j++)
    {b[j-1]=a[j];}
    b[N-1]=a[0];
     for(i=0;i<N;i++)
      {sum=sum+b[i]*i;}
      cout<<sum;
     
          
        
    
        
        
        

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}