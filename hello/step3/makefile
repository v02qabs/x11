install:
	g++ hello-jni.cpp -shared -o libhello-jni.so -w
	ecj hellojni.java
	dx --dex --output=./hellojni.jar hellojni.class

all:
	dalvikvm -cp hellojni.jar hellojni
