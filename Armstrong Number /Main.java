#include <stdio.h>
#include<math.h>
int main() {
	int n,sum=0,c,digit,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    digit=n%10;
    c=digit*digit*digit;
    sum=sum+c;
    n=n/10;
  }
  if(sum==temp)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}