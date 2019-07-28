// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2;
  scanf("%d\n%d",&n1,&n2);
  while(n1!=n2)
  {
    if(n1>n2)
      n1-=n2;
    else
      n2-=n1;
  }
  printf("%d",n1);
 

  
   return 0;
}