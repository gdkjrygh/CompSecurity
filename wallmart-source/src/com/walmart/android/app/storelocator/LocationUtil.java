// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.content.Context;
import android.text.TextUtils;

public class LocationUtil
{

    public LocationUtil()
    {
    }

    public static boolean isLocationServicesEnabled(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return android.provider.Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
        }
        return !TextUtils.isEmpty(android.provider.Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }
}
