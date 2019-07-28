#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,d;
  double h;
  scanf("%f\n%f",&a,&b);
  h=hypotf(a,b);
  printf("%.2f",h);
  return 0;
}