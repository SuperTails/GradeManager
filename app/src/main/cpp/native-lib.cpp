#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_idonthaveadomain_super_1tails_testing_Calendar_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
