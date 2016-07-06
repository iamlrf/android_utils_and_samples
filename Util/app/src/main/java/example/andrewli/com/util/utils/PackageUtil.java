package example.andrewli.com.util.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/**
 * Created by Andrew Li on 2016-07-06.
 */
public class PackageUtil {

    public static boolean isAppInstalled(Context context, String uri) {
        PackageManager pm = context.getPackageManager();
        boolean installed = false;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            installed = false;
        }
        return installed;
    }

    public static void  startApp(Activity activity, String packageName) {
        Intent LaunchIntent= activity.getPackageManager().getLaunchIntentForPackage(packageName);
        activity.startActivity(LaunchIntent);
    }
}
