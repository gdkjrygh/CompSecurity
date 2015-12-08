// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzmg

public static final class zzaGG
{

    private String zzEm;
    private boolean zzaGE;
    private boolean zzaGF;
    private final String zzaGG;

    static String zza(zzaGG zzagg)
    {
        return zzagg.zzaGG;
    }

    static boolean zzb(zzaGG zzagg)
    {
        return zzagg.zzaGE;
    }

    static boolean zzc(zzaGE zzage)
    {
        return zzage.zzaGF;
    }

    static String zzd(zzaGF zzagf)
    {
        return zzagf.zzEm;
    }

    public zzEm zzak(boolean flag)
    {
        zzaGE = flag;
        return this;
    }

    public zzaGE zzal(boolean flag)
    {
        zzaGF = flag;
        return this;
    }

    public zzaGF zzek(String s)
    {
        zzEm = s;
        return this;
    }

    public zzmg zzya()
    {
        return new zzmg(this, null);
    }

    public (String s)
    {
        zzaGE = true;
        zzaGF = false;
        zzaGG = s;
    }
}
