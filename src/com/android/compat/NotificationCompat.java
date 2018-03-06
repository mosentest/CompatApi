package com.android.compat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;

public class NotificationCompat {
	public static void sendNormal(Context context, NotificationManager notificationManager, PendingIntent pendingIntent,
			int notifyId, int smallIcon, Bitmap largeIcon, String ticker, String contentTitle, String contentText,
			boolean autoCannel) {
		if (Build.VERSION.SDK_INT >= 26) {
			NotificationCompat26.sendNormal(context, notificationManager, pendingIntent, notifyId, smallIcon, largeIcon,
					ticker, contentTitle, contentText, autoCannel);
		} else if (Build.VERSION.SDK_INT >= 16) {
			NotificationCompat16.sendNormal(context, notificationManager, pendingIntent, notifyId, smallIcon, largeIcon,
					ticker, contentTitle, contentText, autoCannel);
		} else if (Build.VERSION.SDK_INT >= 11) {
			NotificationCompat11.sendNormal(context, notificationManager, pendingIntent, notifyId, smallIcon, largeIcon,
					ticker, contentTitle, contentText, autoCannel);
		} else {
			NotificationCompatOld.sendNormal(context, notificationManager, pendingIntent, notifyId, smallIcon,
					largeIcon, ticker, contentTitle, contentText, autoCannel);
		}
	}
}
