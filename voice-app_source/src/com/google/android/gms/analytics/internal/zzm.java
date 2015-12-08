// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzm extends Enum
{

    public static final zzm zzKA;
    public static final zzm zzKB;
    public static final zzm zzKC;
    public static final zzm zzKD;
    public static final zzm zzKE;
    private static final zzm zzKF[];
    public static final zzm zzKz;

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
        return (zzm[])zzKF.clone();
    }

    public static zzm zzbc(String s)
    {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(s))
        {
            return zzKA;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(s))
        {
            return zzKB;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s))
        {
            return zzKC;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(s))
        {
            return zzKD;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(s))
        {
            return zzKE;
        } else
        {
            return zzKz;
        }
    }

    static 
    {
        zzKz = new zzm("NONE", 0);
        zzKA = new zzm("BATCH_BY_SESSION", 1);
        zzKB = new zzm("BATCH_BY_TIME", 2);
        zzKC = new zzm("BATCH_BY_BRUTE_FORCE", 3);
        zzKD = new zzm("BATCH_BY_COUNT", 4);
        zzKE = new zzm("BATCH_BY_SIZE", 5);
        zzKF = (new zzm[] {
            zzKz, zzKA, zzKB, zzKC, zzKD, zzKE
        });
    }
}
