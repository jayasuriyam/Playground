#include<stdio.h>
int main()
{
	long int n,f=1,i;
    scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
  printf("%ld",f);
}