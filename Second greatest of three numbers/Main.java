#include<stdio.h>
int main()
{
  int a,b,c,l,s;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if(a>b)
  {
    if(a>c)
      l=a;
    else
      s=a;
  }
  if(b>a)
  {
    if(b>c)
       l=b;
    else
       s=b;
  }
  if(c>a)
  {
    if(c>b)
      l=c;
    else
      s=c;
  }
  printf("%d",s);
    return 0;

      
}