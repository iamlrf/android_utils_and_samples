package com.andrewli.projectb.app.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkManager {

	public static boolean isNetworkOK(Context context) {
		boolean isNetworkOK = false;
		if(null != context) {
			ConnectivityManager connManager = (ConnectivityManager) context
					.getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connManager.getActiveNetworkInfo();
			isNetworkOK = (networkInfo != null) && networkInfo.isAvailable();
		}
		return isNetworkOK;
	}
}
