// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzqf
{
    public static final class zza
    {

        private boolean zzaTm;
        private boolean zzaTn;
        private final String zzaTo;
        private String zztw;

        static String zza(zza zza1)
        {
            return zza1.zzaTo;
        }

        static boolean zzb(zza zza1)
        {
            return zza1.zzaTm;
        }

        static boolean zzc(zza zza1)
        {
            return zza1.zzaTn;
        }

        static String zzd(zza zza1)
        {
            return zza1.zztw;
        }

        public zzqf zzBm()
        {
            return new zzqf(this);
        }

        public zza zzau(boolean flag)
        {
            zzaTm = flag;
            return this;
        }

        public zza zzav(boolean flag)
        {
            zzaTn = flag;
            return this;
        }

        public zza zzfh(String s)
        {
            zztw = s;
            return this;
        }

        public zza(String s)
        {
            zzaTm = true;
            zzaTn = false;
            zzaTo = s;
        }
    }


    private final boolean zzaTm;
    private final boolean zzaTn;
    private final String zzaTo;
    private final String zztw;

    private zzqf(zza zza1)
    {
        zzaTo = zza.zza(zza1);
        zzaTm = zza.zzb(zza1);
        zzaTn = zza.zzc(zza1);
        zztw = zza.zzd(zza1);
    }


    public String getTrackingId()
    {
        return zztw;
    }

    public String zzBj()
    {
        return zzaTo;
    }

    public boolean zzBk()
    {
        return zzaTm;
    }

    public boolean zzBl()
    {
        return zzaTn;
    }
}
