public class hellojni
{
	static
	{
		System.load("/data/data/com.termux/files/home/term-clang/hello/step3/libhello-jni.so");
	}
	public native void hello();

	public static void main(String[] args)
	{
		hellojni h = new hellojni();
		h.hello();
	}
}

