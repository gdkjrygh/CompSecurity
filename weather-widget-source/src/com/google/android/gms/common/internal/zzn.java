// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class zzn
{

    private static final Uri zzaef;
    private static final Uri zzaeg;

    public static Intent zzcn(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    private static Uri zzco(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent zzcp(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(zzco(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent zzoM()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static 
    {
        zzaef = Uri.parse("http://plus.google.com/");
        zzaeg = zzaef.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
