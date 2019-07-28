#include<stdio.h>
int main()
{
  int n,i,t1=1,t2=0,next=1;
  scanf("%d\n",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",t2);
    next=t1+t2;
    t2=t1;
    t1=next;
  }
  return 0;
}