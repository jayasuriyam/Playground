#include<stdio.h>
int main()
{
  	int n,i,max,arr[100];
  scanf("%d",&n);
   for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  max=arr[0];
   for(i=0;i<n;i++)
  {
    if(max<arr[i])
    
      max=arr[i];
   }  
  
  printf("%d",max);
   
  
}