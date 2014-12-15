/*
 * root.cpp
 *
 *  Created on: Dec 10, 2014
 *      Author: duy
 */
#include <jni.h>
#include <math.h>
#include "root.h"
JNIEXPORT jdouble JNICALL Java_main_Root_root
  (JNIEnv * je, jclass jClass, jint number) {
	return sqrt(number);
}




