#include<stdio.h>
#define pi 3.14
int main()
{
  float r,a,l;
  scanf("%f\n%f",&r,&a);
  l=2*pi*r*(a/360);
  printf("%.2f",l);
  return 0;
}