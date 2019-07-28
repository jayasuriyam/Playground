#include<stdio.h>
int main()
{
  int n,k,i,flag=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(k==arr[i])
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
  {
    printf("%d",i+1);
  }
  else
  {
    printf("%d isn't present in the array.",k);
  }
  return 0;
}