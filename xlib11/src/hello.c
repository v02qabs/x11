#include<X11/Xlib.h> //XWindowSystemを扱うための関数群
#include<unistd.h>

int main(){
        Display* d;     //Xサーバーへの接続を表す
        Window wr;      //ウィンドウを表す
        unsigned long black,white;

        d=XOpenDisplay(NULL);  //Xサーバーとの通信確立

        black=BlackPixel(d,DefaultScreen(d)); //色の取得
        white=WhitePixel(d,DefaultScreen(d));

        wr=XCreateSimpleWindow(d,RootWindow(d,DefaultScreen(d)),100,50,800,530,1,black,white); //ウィンドウの生成

        XMapWindow(d,wr); //ウィンドウのマップ

        XFlush(d); //Xサーバーにイベントを送信する

        sleep(5);

        XCloseDisplay(d); //Xサーバーとの通信を切る

        return(0);
}