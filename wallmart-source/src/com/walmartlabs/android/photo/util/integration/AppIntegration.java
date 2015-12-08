// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.integration;

import android.content.Context;
import android.content.Intent;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.model.user.Store;
import java.util.List;

public interface AppIntegration
{
    public static interface SessionRefreshCallback
    {

        public abstract void onFailure(boolean flag);

        public abstract void onSuccess();
    }


    public abstract String getCloudId();

    public abstract Contact getContact();

    public abstract List getCookies();

    public abstract long getLastLoginTime();

    public abstract Intent getLoginActivityIntent(Context context);

    public abstract Intent getNotificationReturnIntent();

    public abstract Store getStore();

    public abstract Intent getStoreSelectionActivityIntent(Context context);

    public abstract String getUsername();

    public abstract boolean hasCredentials();

    public abstract boolean isDebugMode();

    public abstract void refreshSession(SessionRefreshCallback sessionrefreshcallback);
}
