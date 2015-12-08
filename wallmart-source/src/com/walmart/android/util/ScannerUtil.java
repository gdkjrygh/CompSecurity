// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.hardware.Camera;
import com.ebay.redlasersdk.RedLaserExtras;
import com.walmartlabs.utils.WLog;

public class ScannerUtil
{

    private static final String TAG = com/walmart/android/util/ScannerUtil.getSimpleName();

    public ScannerUtil()
    {
    }

    public static boolean scannerAvailable(Context context)
    {
        android.hardware.Camera.CameraInfo camerainfo;
        int i;
        boolean flag;
        flag = false;
        i = 0;
        camerainfo = new android.hardware.Camera.CameraInfo();
        int k = Camera.getNumberOfCameras();
        int j = 0;
_L2:
        flag = i;
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = i;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = i;
        Camera.getCameraInfo(j, camerainfo);
        flag = i;
        i = camerainfo.facing;
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        WLog.e(TAG, "Failed to load camera info", exception);
_L1:
        return flag && RedLaserExtras.checkReadyStatus(context).equals(com.ebay.redlasersdk.RedLaserExtras.RLScannerReadyState.LicensedModeReady);
    }

}
