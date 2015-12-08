// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzgv extends com.google.android.gms.ads.internal.reward.client.zza.zza
{

    private final String zzFz;
    private final int zzGe;

    public zzgv(String s, int i)
    {
        zzFz = s;
        zzGe = i;
    }

    public int getAmount()
    {
        return zzGe;
    }

    public String getType()
    {
        return zzFz;
    }
}
