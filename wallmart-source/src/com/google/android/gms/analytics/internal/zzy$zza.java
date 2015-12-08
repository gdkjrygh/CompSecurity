// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkq;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzy

public static final class zzNP
{

    private final Object zzNP;
    private final zzkq zzNQ;
    private Object zzNR;

    static zzNP zza(String s, float f)
    {
        return zza(s, f, f);
    }

    static zza zza(String s, float f, float f1)
    {
        return new <init>(zzkq.zza(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static <init> zza(String s, int i, int j)
    {
        return new <init>(zzkq.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> zza(String s, long l, long l1)
    {
        return new <init>(zzkq.zza(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> zza(String s, boolean flag, boolean flag1)
    {
        return new <init>(zzkq.zzg(s, flag1), Boolean.valueOf(flag));
    }

    static <init> zzc(String s, long l)
    {
        return zza(s, l, l);
    }

    static zza zzd(String s, String s1, String s2)
    {
        return new <init>(zzkq.zzu(s, s2), s1);
    }

    static <init> zzd(String s, boolean flag)
    {
        return zza(s, flag, flag);
    }

    static zza zze(String s, int i)
    {
        return zza(s, i, i);
    }

    static zza zzn(String s, String s1)
    {
        return zzd(s, s1, s1);
    }

    public Object get()
    {
        if (zzNR != null)
        {
            return zzNR;
        }
        if (zzd.zzacF && zzkq.isInitialized())
        {
            return zzNQ.zznN();
        } else
        {
            return zzNP;
        }
    }

    private (zzkq zzkq1, Object obj)
    {
        zzx.zzv(zzkq1);
        zzNQ = zzkq1;
        zzNP = obj;
    }
}
