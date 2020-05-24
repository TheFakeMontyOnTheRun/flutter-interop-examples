import 'dart:ffi'; // For FFI
import 'dart:io'; // For Platform.isX

final DynamicLibrary nativeCounterLib = Platform.isAndroid
    ? DynamicLibrary.open("libnative_counter.so")
    : DynamicLibrary.process();

final int Function() nativeCounter = nativeCounterLib
    .lookup<NativeFunction<Int32 Function()>>("native_counter")
    .asFunction();
