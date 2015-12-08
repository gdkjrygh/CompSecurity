// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class AppLinks
{

    private static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
    private static final String KEY_NAME_TARGET = "target_url";

    public AppLinks()
    {
    }

    public static Bundle getAppLinkData(Intent intent)
    {
        if (intent != null)
        {
            return intent.getBundleExtra("al_applink_data");
        } else
        {
            return null;
        }
    }

    public static Uri getTargetUrlFromInboundIntent(Intent intent)
    {
        intent = getAppLinkData(intent);
        if (intent != null)
        {
            intent = intent.getString("target_url");
            if (intent != null)
            {
                return Uri.parse(intent);
            }
        }
        return null;
    }
}
