#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float opp,adj,hyp;
  scanf("%f %f",&opp,&adj);
  hyp = opp*opp+adj*adj;
  hyp = sqrt(hyp);
  printf("%0.2f",hyp);
  return 0;
}