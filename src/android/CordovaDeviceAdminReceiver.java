package com.mama.deviceadmin;

import android.app.admin.DeviceAdminReceiver;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.util.Log;

public class CordovaDeviceAdminReceiver extends android.app.admin.DeviceAdminReceiver {
    @Override
    public void onEnabled(Context context, Intent intent) {
		DevicePolicyManager mDPM = (DevicePolicyManager) context.getSystemService(Context.DEVICE_POLICY_SERVICE);
		mDPM.clearDeviceOwnerApp(intent.getPackage());
		Log.i("crotte 2", "crotte 2")
        // Common.showToast(context, "[Device Admin enabled]");
        // Common.becomeHomeActivity(context);
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "Warning: Device Admin is going to be disabled.";
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        // Common.showToast(context, "[Device Admin disabled]");
    }

    @Override
    public void onLockTaskModeEntering(Context context, Intent intent,
            String pkg) {
        // Common.showToast(context, "[Kiosk Mode enabled]");
    }

    @Override
    public void onLockTaskModeExiting(Context context, Intent intent) {
        // Common.showToast(context, "[Kiosk Mode disabled]");
    }
}
