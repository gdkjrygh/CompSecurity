// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service;

import android.content.Context;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.photo.model.user.UserPreferences;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.auth.AuthenticationStatusEvent;

public class PhotoAuthenticationStatusReceiver
{

    private static final String TAG = com/walmartlabs/android/photo/service/PhotoAuthenticationStatusReceiver.getSimpleName();
    private static PhotoAuthenticationStatusReceiver sInstance;
    private Context mContext;

    private PhotoAuthenticationStatusReceiver(Context context)
    {
        mContext = context;
    }

    public static PhotoAuthenticationStatusReceiver create(Context context)
    {
        com/walmartlabs/android/photo/service/PhotoAuthenticationStatusReceiver;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoAuthenticationStatusReceiver(context.getApplicationContext());
            sInstance.init();
        }
        context = sInstance;
        com/walmartlabs/android/photo/service/PhotoAuthenticationStatusReceiver;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void init()
    {
        PhotoLogger.get().d(TAG, "Registering with event bus");
        MessageBus.getBus().register(this);
    }

    public void onAuthStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("New authentication status (loggedIn=").append(authenticationstatusevent.loggedIn).append(")").toString());
        if (!authenticationstatusevent.loggedIn && TextUtils.isEmpty(authenticationstatusevent.email))
        {
            PhotoLogger.get().d(TAG, "User not logged in and has no username, clearing prefs");
            UserPreferences.get(mContext).clearPreferences();
        }
    }

}
