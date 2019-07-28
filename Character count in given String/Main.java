#include<stdio.h>
int main()
{
	char s[100],i,b;
    scanf("%s",s);
    for(i=0;s[i]!='\0';i++)
    {
      int count=1;
      while(s[i]==s[i+1])
      {
        i++;
        count++;
      }
      if(count<=20)
      {
      printf("%c%d",s[i],count);
      }
      else if(count>20)
        printf("Invalid Input");
        
    }
        
}