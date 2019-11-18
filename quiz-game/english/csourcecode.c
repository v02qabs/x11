#include <sqlite3.h>
#include <stdio.h>


int sqlite3exe(void *cb_arg, int column_coun, char **data, char **column_name);

int main()
{
	char *fname = "./english.db";
	sqlite3 *db;
	int ret;
	char **errormsg = '\0';
	ret = sqlite3_open(fname, &db);
	if(ret != SQLITE_OK)
		printf("error\n");
	int init;
	ret = sqlite3_exec(db, "select * from words", sqlite3exe, &init, &errormsg);

		if(ret != SQLITE_OK)
			printf("error\0");
	
	
	return 0;
}

int sqlite3exe(void *cb_arg, int column_count, char **data, char ** column_name)
{
	int i,*db_type;
	db_type = (int *)cb_arg;
	printf("%s, %s\n", column_name[0], data[0]);
	return 0;
}
