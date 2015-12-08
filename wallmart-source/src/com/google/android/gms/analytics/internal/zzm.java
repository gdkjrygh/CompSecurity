// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzm extends Enum
{

    public static final zzm zzMA;
    public static final zzm zzMB;
    public static final zzm zzMC;
    public static final zzm zzMD;
    public static final zzm zzME;
    private static final zzm zzMF[];
    public static final zzm zzMz;

    private zzm(String s, int i)
    {
        super(s, i);
    }

    public static zzm valueOf(String s)
    {
        return (zzm)Enum.valueOf(com/google/android/gms/analytics/internal/zzm, s);
    }

    public static zzm[] values()
    {
        return (zzm[])zzMF.clone();
    }

    public static zzm zzbh(String s)
    {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(s))
        {
            return zzMA;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(s))
        {
            return zzMB;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s))
        {
            return zzMC;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(s))
        {
            return zzMD;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(s))
        {
            return zzME;
        } else
        {
            return zzMz;
        }
    }

    static 
    {
        zzMz = new zzm("NONE", 0);
        zzMA = new zzm("BATCH_BY_SESSION", 1);
        zzMB = new zzm("BATCH_BY_TIME", 2);
        zzMC = new zzm("BATCH_BY_BRUTE_FORCE", 3);
        zzMD = new zzm("BATCH_BY_COUNT", 4);
        zzME = new zzm("BATCH_BY_SIZE", 5);
        zzMF = (new zzm[] {
            zzMz, zzMA, zzMB, zzMC, zzMD, zzME
        });
    }
}
