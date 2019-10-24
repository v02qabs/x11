#include <iostream>
#include <jni.h>
#include "hello.h"

using namespace std;

extern "C"
{
JNIEXPORT void JNICALL Java_hellojni_hello(JNIEnv *env,
		jobject obj)
{
	cout << "Hello." << endl;
}
}
