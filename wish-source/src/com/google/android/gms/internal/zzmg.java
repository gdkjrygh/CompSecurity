// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzmg
{
    public static final class zza
    {

        private String zzEm;
        private boolean zzaGE;
        private boolean zzaGF;
        private final String zzaGG;

        static String zza(zza zza1)
        {
            return zza1.zzaGG;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzaGE;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzaGF;
        }

        static String zzd(zza zza1)
        {
            return zza1.zzEm;
        }

        public zza zzak(boolean flag)
        {
            zzaGE = flag;
            return this;
        }

        public zza zzal(boolean flag)
        {
            zzaGF = flag;
            return this;
        }

        public zza zzek(String s)
        {
            zzEm = s;
            return this;
        }

        public zzmg zzya()
        {
            return new zzmg(this);
        }

        public zza(String s)
        {
            zzaGE = true;
            zzaGF = false;
            zzaGG = s;
        }
    }


    private final String zzEm;
    private final boolean zzaGE;
    private final boolean zzaGF;
    private final String zzaGG;

    private zzmg(zza zza1)
    {
        zzaGG = zza.zza(zza1);
        zzaGE = zza.zzb(zza1);
        zzaGF = zza.zzc(zza1);
        zzEm = zza.zzd(zza1);
    }


    public String zzjr()
    {
        return zzEm;
    }

    public String zzxX()
    {
        return zzaGG;
    }

    public boolean zzxY()
    {
        return zzaGE;
    }

    public boolean zzxZ()
    {
        return zzaGF;
    }
}
