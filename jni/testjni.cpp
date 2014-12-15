#include <jni.h>
#include "testjni.h"
JNIEXPORT jint JNICALL Java_main_SquaredWrapper_square(JNIEnv * je, jobject jclass,
		jint base) {
	return base*base;
}
