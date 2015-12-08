// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static final class zzaTo
{

    private boolean zzaTm;
    private boolean zzaTn;
    private final String zzaTo;
    private String zztw;

    static String zza(zzaTo zzato)
    {
        return zzato.zzaTo;
    }

    static boolean zzb(zzaTo zzato)
    {
        return zzato.zzaTm;
    }

    static boolean zzc(zzaTm zzatm)
    {
        return zzatm.zzaTn;
    }

    static String zzd(zzaTn zzatn)
    {
        return zzatn.zztw;
    }

    public zzqf zzBm()
    {
        return new zzqf(this, null);
    }

    public t> zzau(boolean flag)
    {
        zzaTm = flag;
        return this;
    }

    public zzaTm zzav(boolean flag)
    {
        zzaTn = flag;
        return this;
    }

    public zzaTn zzfh(String s)
    {
        zztw = s;
        return this;
    }

    public (String s)
    {
        zzaTm = true;
        zzaTn = false;
        zzaTo = s;
    }
}
