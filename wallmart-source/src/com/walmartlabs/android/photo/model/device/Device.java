// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.device;

import android.content.Context;
import com.walmartlabs.android.photo.model.installation.Installation;

public class Device
{

    private static Device sInstance;
    private Context mContext;

    private Device(Context context)
    {
        mContext = context;
    }

    public static Device get(Context context)
    {
        com/walmartlabs/android/photo/model/device/Device;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new Device(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/model/device/Device;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public String getInstallationID()
    {
        return Installation.id(mContext);
    }
}
