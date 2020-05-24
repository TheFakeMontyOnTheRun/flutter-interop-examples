package com.example.kotlin_method_not_used;


import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {

	static int counter = 0;

	@Override
	public void configureFlutterEngine( FlutterEngine flutterEngine) {
		super.configureFlutterEngine(flutterEngine);
		new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "farofinhaChannel")
				.setMethodCallHandler(
						(call, result) -> {
							if (call.method.equals("farofinhaMethod")) {
								counter += 2;
								result.success(counter);
							} else {
								result.notImplemented();
							}
						}
				);
	}
}
