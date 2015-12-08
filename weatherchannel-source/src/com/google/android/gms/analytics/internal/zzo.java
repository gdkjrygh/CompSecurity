// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzo extends Enum
{

    public static final zzo zzKK;
    public static final zzo zzKL;
    private static final zzo zzKM[];

    private zzo(String s, int i)
    {
        super(s, i);
    }

    public static zzo valueOf(String s)
    {
        return (zzo)Enum.valueOf(com/google/android/gms/analytics/internal/zzo, s);
    }

    public static zzo[] values()
    {
        return (zzo[])zzKM.clone();
    }

    public static zzo zzbd(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return zzKL;
        } else
        {
            return zzKK;
        }
    }

    static 
    {
        zzKK = new zzo("NONE", 0);
        zzKL = new zzo("GZIP", 1);
        zzKM = (new zzo[] {
            zzKK, zzKL
        });
    }
}
