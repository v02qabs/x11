#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[])
{
	if(argc<1)
		printf("引数が足りません。\n");
	
	printf("読み込むファイル名：%s\n", argv[1]);
	
	FILE *fp;
	char *filename = argv[1];
	fp = fopen(filename, "r");
	if(fp == NULL)
		printf("ファイルを読み込めません。\n");

	char subject[6000];
	while(fgets(subject , 6000, fp))
	{
		printf("%s\n", subject);
	}
	fclose(fp);
}


