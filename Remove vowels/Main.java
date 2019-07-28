#include<stdio.h>
int main()
{
  char str[100],i;
  scanf("%[^\n]s", str);
  for(i=0;str[i]!='\0';i++)
  {  
        if(str[i] == 'a'||str[i] == 'e'||str[i] == 'i'||str[i]  == 'o'||str[i] == 'u'||str[i]=='I')
        {
        }
        else
          printf("%c",str[i]);
         
        
  }
  
  
 
  
 
  
  return 0;
}