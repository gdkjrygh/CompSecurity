// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzmp, zzmj

public static class zzaHd
{
    public static final class zza extends Enum
    {

        public static final zza zzaHg;
        public static final zza zzaHh;
        public static final zza zzaHi;
        private static final zza zzaHj[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzmp$zza$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaHj.clone();
        }

        static 
        {
            zzaHg = new zza("NETWORK", 0);
            zzaHh = new zza("DISK", 1);
            zzaHi = new zza("DEFAULT", 2);
            zzaHj = (new zza[] {
                zzaHg, zzaHh, zzaHi
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status zzKr;
    private final zza zzaHb;
    private final byte zzaHc[];
    private final long zzaHd;
    private final zzmj zzaHe;
    private final zza zzaHf;

    public Status getStatus()
    {
        return zzKr;
    }

    public zza zzyl()
    {
        return zzaHb;
    }

    public byte[] zzym()
    {
        return zzaHc;
    }

    public zzmj zzyn()
    {
        return zzaHe;
    }

    public zzaHe zzyo()
    {
        return zzaHf;
    }

    public long zzyp()
    {
        return zzaHd;
    }

    public zza(Status status, zzmj zzmj, zza zza1)
    {
        this(status, zzmj, null, null, zza1, 0L);
    }

    public zza(Status status, zzmj zzmj, byte abyte0[], zza zza1, zza zza2, long l)
    {
        zzKr = status;
        zzaHe = zzmj;
        zzaHc = abyte0;
        zzaHf = zza1;
        zzaHb = zza2;
        zzaHd = l;
    }
}
