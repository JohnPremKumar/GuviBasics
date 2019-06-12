#include <stdio.h>

int main(void) {
	int i;
    char ch[100];
    for(i=0;i<=7;i++)
    {
    scanf("%c",&ch[i]);
    }
    for(i=7;i>=0;i--)
    {
        printf("%c",ch[i]);
    }
	return 0;
}
//
