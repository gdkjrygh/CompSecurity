// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.youtube.player.internal.b.b;
import java.util.List;

public final class e
{

    public static Intent a(Context context, String s, boolean flag, boolean flag1)
    {
        return (new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://www.youtube.com/watch?v=")).append(s).toString()))).setPackage(b(context)).putExtra("force_fullscreen", false).putExtra("finish_on_ended", false);
    }

    public static boolean a(Context context)
    {
        Intent intent = (new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtube.com/watch?v="))).setPackage(b(context));
        context = context.getPackageManager().queryIntentActivities(intent, 0x10000);
        return context != null && !context.isEmpty();
    }

    private static String b(Context context)
    {
        if (com.google.android.youtube.player.internal.b.b.a(context.getPackageManager()))
        {
            return "com.google.android.youtube.googletv";
        } else
        {
            return "com.google.android.youtube";
        }
    }
}
