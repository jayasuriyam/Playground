#include<stdio.h>
int main()
{
  int len=0,i;
  char str[20];
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    len++;
  }
  printf("%d",len);
  return 0;
}