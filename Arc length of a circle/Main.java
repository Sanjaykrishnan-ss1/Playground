#include<stdio.h>
void main()
{ 
  float r,c;
  float a;
  scanf("%f %f",&r,&c);
  a = 2*3.14*r*(c/360.0f);
  printf("%0.2f",a);
   return;
}