// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzo extends Enum
{

    public static final zzo zzMJ;
    public static final zzo zzMK;
    private static final zzo zzML[];

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
        return (zzo[])zzML.clone();
    }

    public static zzo zzbi(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return zzMK;
        } else
        {
            return zzMJ;
        }
    }

    static 
    {
        zzMJ = new zzo("NONE", 0);
        zzMK = new zzo("GZIP", 1);
        zzML = (new zzo[] {
            zzMJ, zzMK
        });
    }
}
