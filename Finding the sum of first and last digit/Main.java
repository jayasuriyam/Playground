#include <stdio.h>
int main() {
	int n,a,b,t;
  scanf("%d",&n);
  a=n%10;
  t=n;
  while(t>10)
  {
    t=t/10;
  }
  b=a+t;
  printf("%d",b);
	return 0;
}