#include<stdio.h>
#include<string.h>
int main()
{
  char s1[10],s2[10],s3[10],i;
  scanf("%s\n%s\n%s",s1,s2,s3);
  for(i=0;s1[i]!='\0';i++)
  {
    if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U')
     printf("$");
    else
      printf("%c",s1[i]);
  }
  for(i=0;s2[i]!='\0';i++)
  {
    if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u'||s2[i]=='A'||s2[i]=='E'||s2[i]=='I'||s2[i]=='O'||s2[i]=='U')
    printf("%c",s2[i]);
    else
    printf("#");
  }
  for(i=0;i<=strlen(s3);i++)
  {
    if(s3[i]>=97&&s3[i]<=122)
    {
      s3[i]=s3[i]-32;
    }
  }
      printf("%s",s3);
    
  
     
 
    
  
   
   
  
      

  
  // type your code here 
}