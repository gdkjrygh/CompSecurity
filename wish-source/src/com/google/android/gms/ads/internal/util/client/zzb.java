// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;

public final class zzb
{

    public static boolean zzC(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && (i != 2 || zzfl());
    }

    public static void zza(String s, Throwable throwable)
    {
        if (zzC(3))
        {
            Log.d("Ads", s, throwable);
        }
    }

    public static void zzaj(String s)
    {
        if (zzC(3))
        {
            Log.d("Ads", s);
        }
    }

    public static void zzak(String s)
    {
        if (zzC(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void zzal(String s)
    {
        if (zzC(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void zzam(String s)
    {
        if (zzC(2))
        {
            Log.v("Ads", s);
        }
    }

    public static void zzan(String s)
    {
        if (zzC(5))
        {
            Log.w("Ads", s);
        }
    }

    public static void zzb(String s, Throwable throwable)
    {
        if (zzC(6))
        {
            Log.e("Ads", s, throwable);
        }
    }

    public static void zzc(String s, Throwable throwable)
    {
        if (zzC(4))
        {
            Log.i("Ads", s, throwable);
        }
    }

    public static void zzd(String s, Throwable throwable)
    {
        if (zzC(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean zzfl()
    {
        return ((Boolean)zzat.zzrW.get()).booleanValue();
    }
}
