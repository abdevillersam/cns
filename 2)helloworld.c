#include <stdio.h>
#include<stdlib.h>
void main()
{
char str[]="Hello World";
char str1[11];
char str2[11];
int i,len;
len = strlen(str);
for(i=0;i<len;i++)
{
str1[i] = (str[i]&127) | (str[i]^127);
printf("%d",str1[i]);
}
printf("\n");
for(i=0;i<len;i++)
{
str2[i] = (str[i]&127) & (str[i]^127);
printf("%d",str2[i]);
}
printf("\n");
}