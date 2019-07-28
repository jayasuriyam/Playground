#include<stdio.h>
#include<math.h>
int main()
{
  int y;
  float p,r,s;
  scanf("%f\n%d\n%f",&p,&y,&r);
  s=((p*y*r)/100);
  printf("%f",s);
  return 0;
}