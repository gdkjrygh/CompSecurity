// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public class zzmp
    implements Result
{
    public static class zza
    {

        private final Status zzKr;
        private final zza zzaHb;
        private final byte zzaHc[];
        private final long zzaHd;
        private final zzmj zzaHe;
        private final zzmq.zzc zzaHf;

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

        public zzmq.zzc zzyo()
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

        public zza(Status status, zzmj zzmj, byte abyte0[], zzmq.zzc zzc, zza zza1, long l)
        {
            zzKr = status;
            zzaHe = zzmj;
            zzaHc = abyte0;
            zzaHf = zzc;
            zzaHb = zza1;
            zzaHd = l;
        }
    }

    public static final class zza.zza extends Enum
    {

        public static final zza.zza zzaHg;
        public static final zza.zza zzaHh;
        public static final zza.zza zzaHi;
        private static final zza.zza zzaHj[];

        public static zza.zza valueOf(String s)
        {
            return (zza.zza)Enum.valueOf(com/google/android/gms/internal/zzmp$zza$zza, s);
        }

        public static zza.zza[] values()
        {
            return (zza.zza[])zzaHj.clone();
        }

        static 
        {
            zzaHg = new zza.zza("NETWORK", 0);
            zzaHh = new zza.zza("DISK", 1);
            zzaHi = new zza.zza("DEFAULT", 2);
            zzaHj = (new zza.zza[] {
                zzaHg, zzaHh, zzaHi
            });
        }

        private zza.zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final zza zzaHa;

    public zzmp(zza zza1)
    {
        zzaHa = zza1;
    }

    public Status getStatus()
    {
        return zzaHa.getStatus();
    }

    public zza zzyk()
    {
        return zzaHa;
    }
}
