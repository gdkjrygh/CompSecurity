// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;

public final class zzb
{

    public static boolean zzL(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && (i != 2 || zzgx());
    }

    public static void zza(String s, Throwable throwable)
    {
        if (zzL(3))
        {
            Log.d("Ads", s, throwable);
        }
    }

    public static void zzaA(String s)
    {
        if (zzL(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void zzaB(String s)
    {
        if (zzL(2))
        {
            Log.v("Ads", s);
        }
    }

    public static void zzaC(String s)
    {
        if (zzL(5))
        {
            Log.w("Ads", s);
        }
    }

    public static void zzay(String s)
    {
        if (zzL(3))
        {
            Log.d("Ads", s);
        }
    }

    public static void zzaz(String s)
    {
        if (zzL(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void zzb(String s, Throwable throwable)
    {
        if (zzL(6))
        {
            Log.e("Ads", s, throwable);
        }
    }

    public static void zzc(String s, Throwable throwable)
    {
        if (zzL(4))
        {
            Log.i("Ads", s, throwable);
        }
    }

    public static void zzd(String s, Throwable throwable)
    {
        if (zzL(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean zzgx()
    {
        return ((Boolean)zzbz.zzut.get()).booleanValue();
    }
}
