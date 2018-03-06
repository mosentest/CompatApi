package com.android.compat;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public class ViewCompat {

	@SuppressLint("NewApi")
	public void setBackground(View view, Drawable drawable) {
		if (Build.VERSION.SDK_INT >= 16) {
			view.setBackground(drawable);
		} else {
			view.setBackgroundDrawable(drawable);
		}
	}

}
