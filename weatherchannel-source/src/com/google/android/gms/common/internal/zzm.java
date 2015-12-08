// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class zzm
{

    private static final Uri zzaaV;
    private static final Uri zzaaW;

    public static Intent zzce(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    private static Uri zzcf(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent zzcg(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(zzcf(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent zznX()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static 
    {
        zzaaV = Uri.parse("http://plus.google.com/");
        zzaaW = zzaaV.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
