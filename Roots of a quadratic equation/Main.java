#include<stdio.h>
#include<math.h>

int main()
{
  float a,b,c,d,r1,r2,i,r;
  scanf("%f\n%f\n%f",&a,&b,&c);
  d = ((b*b) - (4*a*c));
  if(d > 0)
  {
    r1=(-b + sqrt(d))/(2*a);
    r2=(-b - sqrt(d))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(d == 0)
  {
    r1 = r2 = (-b/2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else
  {
    r = -b/(2*a);
    i = sqrt(-d)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",r,i,r,i);
  }
  
}