// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.samsung.android.sdk.SsdkInterface;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.SsdkVendorCheck;

public class Srn
    implements SsdkInterface
{

    private static final int VERSION_CODE = 1;
    private static final String VERSION_NAME = "1.0.0";

    public Srn()
    {
    }

    private void insertLog(Context context)
    {
        int i = -1;
        int j = context.getPackageManager().getPackageInfo("com.samsung.android.providers.context", 128).versionCode;
        i = j;
_L1:
        Log.d("SM_SDK", (new StringBuilder("versionCode: ")).append(i).toString());
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        if (i > 1)
        {
            if (context.checkCallingOrSelfPermission("com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY") != 0)
            {
                throw new SecurityException();
            } else
            {
                ContentValues contentvalues = new ContentValues();
                Object obj = getClass().getPackage().getName();
                String s = (new StringBuilder(String.valueOf(context.getPackageName()))).append("#").append(getVersionCode()).toString();
                contentvalues.put("app_id", ((String) (obj)));
                contentvalues.put("feature", s);
                obj = new Intent();
                ((Intent) (obj)).setAction("com.samsung.android.providers.context.log.action.USE_APP_FEATURE_SURVEY");
                ((Intent) (obj)).putExtra("data", contentvalues);
                ((Intent) (obj)).setPackage("com.samsung.android.providers.context");
                context.sendBroadcast(((Intent) (obj)));
                return;
            }
        } else
        {
            Log.d("SM_SDK", "Add com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY permission");
            return;
        }
        namenotfoundexception;
        Log.d("SM_SDK", "Could not find ContextProvider");
          goto _L1
    }

    public int getVersionCode()
    {
        return 1;
    }

    public String getVersionName()
    {
        return "1.0.0";
    }

    public void initialize(Context context)
        throws SsdkUnsupportedException
    {
        if (context == null)
        {
            throw new NullPointerException("context is null.");
        }
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            throw new SsdkUnsupportedException("Device is not supported", 1);
        }
        if (!SsdkVendorCheck.isSamsungDevice())
        {
            throw new SsdkUnsupportedException("Vendor is not supported", 0);
        }
        try
        {
            insertLog(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new SecurityException("com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY permission is required");
        }
    }

    public boolean isFeatureEnabled(int i)
    {
        return false;
    }
}
