// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public final class a
{

    public static PendingIntent a(Context context)
    {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.google.android.youtube.action.widget_update"), 0);
    }
}
