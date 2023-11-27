#include "JNI.h"

JNIEXPORT void JNICALL Java_java_1native_JNI_sayHii
  (JNIEnv *, jobject)
  {
  	printf("\nHow are you from c!");
  }
  
  JNIEXPORT void JNICALL Java_java_1native_JNI_multiply
  (JNIEnv *, jobject, jint a, jint b)
  {
  	return a*b;
  }
