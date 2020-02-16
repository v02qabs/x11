#include <stdio.h>
#include <time.h>
 
int main(void)
{
    time_t timer;        /* 時刻を取り出すための型（実際はunsigned long型） */
    struct tm *local;    /* tm構造体（時刻を扱う */
 
    /* 年月日と時分秒保存用 */
    int year, month, day, hour, minute, second;
     
    timer = time(NULL);        /* 現在時刻を取得 */
    local = localtime(&timer);    /* 地方時に変換 */
 
    /* 年月日と時分秒をtm構造体の各パラメタから変数に代入 */
    year = local->tm_year + 1900;        /* 1900年からの年数が取得されるため */
    month = local->tm_mon + 1;        /* 0を1月としているため */
    day = local->tm_mday;
    hour = local->tm_hour;
    minute = local->tm_min;
    second = local->tm_sec;
 
    /* 現在の日時を表示 */
    printf("%d/%d/%d %d:%d:%d\n", year, month, day, hour, minute, second);
     
    return 0;
}
