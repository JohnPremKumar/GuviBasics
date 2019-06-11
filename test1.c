#include<stdio.h>
#include<stdlib.h>
int min(int a, int b, int c)
{
int m = a;
if (m > b)
m = b;
if (m > c)
m = c;
return m;
}
void printMaxSubSquare(int M[1000][1000],int R ,int C)
{
int i,j,c;
int S[R][C];
int max, maxi, maxj;
for(i = 0; i < R; i++)
{
S[i][0] = M[i][0];
}
for(j = 0; j < C; j++){
S[0][j] = M[0][j];
}
for(i = 1; i < R; i++)
{
for(j = 1; j < C; j++)
{
if(M[i][j] == 1)
S[i][j] = min(S[i][j-1], S[i-1][j],
S[i-1][j-1]) + 1;
else
S[i][j] = 0;
}
}
max = S[0][0]; maxi = 0; maxj = 0;
for(i = 0; i < R; i++)
{
for(j = 0; j < C; j++)
{
if(max < S[i][j])
{
max = S[i][j];
maxi = i;
maxj = j;
}
}
}
   
  
   for(i=maxi;i>maxi-max;i--){
       for(j=maxj;j>maxj-max;j--){
           printf("1 ");
       }
      printf("\n");
   }
    
}
int main()
{
int R,C,i,j,M[1000][1000];
scanf("%d %d",&R,&C);
for(i=0;i<R;i++){
for(j=0;j<C;j++){
scanf("%d ",&M[i][j]);
}
// printf("\n");
}
printMaxSubSquare(M,R,C);
 }
