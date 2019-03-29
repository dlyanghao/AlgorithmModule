package work.yanghao.jni;

/**
 * JNI
 */
public class JavaNativeInterfaceMethods {


    /**
     * Load native library (the library is not exist! though design)
     * the library name to be say YangHao.h(like)
     */
    static {
        System.loadLibrary("YangHao");
    }

    /**
     * java native interface
     * @return
     */
    public native String forceGetTheVariableAddress(String variable);


    /**
     * Test enter
     * @param args
     * Before executed the main method, you must create the YangHao.h to native library
     * use the javac and javah command to create the class head file
     * tips:enter the compile class folder like: javah -jni work.yanghao.jni.JavaNativeInterfaceMethods
     *
     */
    public static void main(String[] args) {

        String variable = "HelloWorld";

        String result = new JavaNativeInterfaceMethods().forceGetTheVariableAddress(variable);
        System.out.println(result);
    }
}
