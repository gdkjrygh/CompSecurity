// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkf;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzy

public static final class zzLQ
{

    private final Object zzLQ;
    private final zzkf zzLR;
    private Object zzLS;

    static zzLQ zza(String s, float f)
    {
        return zza(s, f, f);
    }

    static zza zza(String s, float f, float f1)
    {
        return new <init>(zzkf.zza(s, Float.valueOf(f1)), Float.valueOf(f));
    }

    static <init> zza(String s, int i, int j)
    {
        return new <init>(zzkf.zza(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static <init> zza(String s, long l, long l1)
    {
        return new <init>(zzkf.zza(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static <init> zza(String s, boolean flag, boolean flag1)
    {
        return new <init>(zzkf.zzg(s, flag1), Boolean.valueOf(flag));
    }

    static <init> zzc(String s, long l)
    {
        return zza(s, l, l);
    }

    static zza zzd(String s, String s1, String s2)
    {
        return new <init>(zzkf.zzs(s, s2), s1);
    }

    static <init> zzd(String s, boolean flag)
    {
        return zza(s, flag, flag);
    }

    static zza zze(String s, int i)
    {
        return zza(s, i, i);
    }

    static zza zzm(String s, String s1)
    {
        return zzd(s, s1, s1);
    }

    public Object get()
    {
        if (zzLS != null)
        {
            return zzLS;
        }
        if (zzd.zzZR && zzkf.isInitialized())
        {
            return zzLR.zzmZ();
        } else
        {
            return zzLQ;
        }
    }

    private (zzkf zzkf1, Object obj)
    {
        zzu.zzu(zzkf1);
        zzLR = zzkf1;
        zzLQ = obj;
    }
}
