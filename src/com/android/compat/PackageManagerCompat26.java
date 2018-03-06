package com.android.compat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;

public class PackageManagerCompat26 {

	@SuppressLint("NewApi")
	public static boolean canRequestPackageInstalls(PackageManager pm) {
		return pm.canRequestPackageInstalls();
	}

	public static void goInstallPage26(Context context) {
		if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
			Uri parse = Uri.parse("package:" + context.getPackageName());
			Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", parse);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(intent);
		}
	}
}
