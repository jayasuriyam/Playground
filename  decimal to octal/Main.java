#include<stdio.h>
#include<math.h>
int ConvertDecimalToOctal(int decimalNumber);
int main()
{
  int decimalNumber;
  scanf("%d",&decimalNumber);
  printf("%d",ConvertDecimalToOctal(decimalNumber));
   return 0;
}
int ConvertDecimalToOctal(int decimalNumber)
{
  int octalnumber=0,i=1;
  while(decimalNumber!=0)
  {
    octalnumber=octalnumber+(decimalNumber%8)*i;
    decimalNumber/=8;
    i *=10;
  }
  return octalnumber;
}