#include<stdio.h>
int main()
{
  int n,a,b;
  scanf("%d",&n);
  a=n%10;
  n=n/10;
  b=a+n;
  printf("%d",b);
  
  
  return 0;
}