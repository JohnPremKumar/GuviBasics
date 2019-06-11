#include <stdio.h>
 
 
int main(void) {
	long int n,i,j,k=0;
	scanf("%ld",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%ld",&a[i]);
		if((i%2&&a[i]%2==0)||(i%2==0&&a[i]%2)){
			k++;
			printf("%d",a[i]);
			if(i<n-1)
			printf(" ");
		}
	}
	if(k==0)
	printf("-1");
	return 0;
}
