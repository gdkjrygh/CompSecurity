// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class GooglePlay
{

    private static final Intent GOOGLE_PLAY_INTENT = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.walmart.android"));

    public GooglePlay()
    {
    }

    public static boolean isAvailable(Context context)
    {
        return GOOGLE_PLAY_INTENT.resolveActivity(context.getPackageManager()) != null;
    }

    public static void launch(Activity activity)
    {
        activity.startActivity(GOOGLE_PLAY_INTENT);
    }

    public static void launchIfAvailable(Activity activity)
    {
        if (isAvailable(activity))
        {
            launch(activity);
        }
    }

}
