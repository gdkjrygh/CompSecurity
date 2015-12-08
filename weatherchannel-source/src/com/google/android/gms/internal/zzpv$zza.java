// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzpv

public static final class zzaOU
{

    private boolean zzaOS;
    private boolean zzaOT;
    private final String zzaOU;
    private String zztd;

    static String zza(zzaOU zzaou)
    {
        return zzaou.zzaOU;
    }

    static boolean zzb(zzaOU zzaou)
    {
        return zzaou.zzaOS;
    }

    static boolean zzc(zzaOS zzaos)
    {
        return zzaos.zzaOT;
    }

    static String zzd(zzaOT zzaot)
    {
        return zzaot.zztd;
    }

    public zztd zzap(boolean flag)
    {
        zzaOS = flag;
        return this;
    }

    public zzaOS zzaq(boolean flag)
    {
        zzaOT = flag;
        return this;
    }

    public zzaOT zzeS(String s)
    {
        zztd = s;
        return this;
    }

    public zzpv zzzW()
    {
        return new zzpv(this, null);
    }

    public (String s)
    {
        zzaOS = true;
        zzaOT = false;
        zzaOU = s;
    }
}
