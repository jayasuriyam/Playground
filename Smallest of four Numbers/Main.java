#include<stdio.h>

int main()
{
  int a,b,c,d,min;
  scanf("%d\t%d\t%d\t%d",&a,&b,&c,&d);
  min=a<b?a:b;
  min=(c<d?(c<min?c:min):(d<min?d:min));
  printf("%d",min);
  
  
}