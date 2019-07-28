#include <stdio.h>
int main()
{
  	int b,i,e,c=1;
    scanf("%d\n%d",&b,&e);
    if(e>=0)
    {
      for(i=1;i<=e;i++)
      {
        c=c*b;
      }
      printf("%d",c);
    }
  else
  {
    printf("Wrong input");
  }
    return 0;
}