// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class zzkz
{

    private static Pattern zzacJ = null;

    public static boolean zzai(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int zzbN(int i)
    {
        return i / 1000;
    }

    public static int zzbO(int i)
    {
        return (i % 1000) / 100;
    }

    public static boolean zzbP(int i)
    {
        return zzbO(i) == 3;
    }

}
