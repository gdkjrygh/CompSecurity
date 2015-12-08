// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.photo;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.photo.util.PhotoSettings;
import com.walmartlabs.utils.WLog;

public class PhotoAppConfigurationReceiver
{

    private static final String TAG = com/walmart/android/app/photo/PhotoAppConfigurationReceiver.getSimpleName();
    private static PhotoAppConfigurationReceiver sInstance;
    private Context mContext;

    private PhotoAppConfigurationReceiver(Context context)
    {
        mContext = context;
    }

    public static PhotoAppConfigurationReceiver create(Context context)
    {
        com/walmart/android/app/photo/PhotoAppConfigurationReceiver;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoAppConfigurationReceiver(context.getApplicationContext());
            sInstance.init();
        }
        context = sInstance;
        com/walmart/android/app/photo/PhotoAppConfigurationReceiver;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onNewAppConfiguration(AppConfig appconfig)
    {
        WLog.d(TAG, "onNewAppConfiguration()");
        if (appconfig != null)
        {
            PhotoSettings photosettings = PhotoSettings.get(mContext);
            boolean flag;
            if (!appconfig.photoDisabled)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            photosettings.setPhotoEnabled(flag);
        }
    }

}
