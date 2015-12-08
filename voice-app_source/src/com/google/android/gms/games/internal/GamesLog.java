// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.zzn;

public final class GamesLog
{

    private static final zzn zzaft = new zzn("Games");

    private GamesLog()
    {
    }

    public static void zza(String s, String s1, Throwable throwable)
    {
        zzaft.zza(s, s1, throwable);
    }

    public static void zzb(String s, String s1, Throwable throwable)
    {
        zzaft.zzb(s, s1, throwable);
    }

    public static void zzu(String s, String s1)
    {
        zzaft.zzu(s, s1);
    }

    public static void zzv(String s, String s1)
    {
        zzaft.zzv(s, s1);
    }

}
