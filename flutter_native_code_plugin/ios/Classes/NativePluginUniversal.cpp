//
// Created by Daniel Monteiro on 24/05/2020.
//
#include <stdint.h>

int32_t counter = 0;

extern "C" __attribute__((visibility("default"))) __attribute__((used))
int32_t native_counter() {
    counter += 3;
    return counter;
}
