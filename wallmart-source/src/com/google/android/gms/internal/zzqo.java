// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqi

public class zzqo
    implements Result
{
    public static class zza
    {

        private final Status zzQA;
        private final zza zzaTJ;
        private final byte zzaTK[];
        private final long zzaTL;
        private final zzqi zzaTM;
        private final zzqp.zzc zzaTN;

        public Status getStatus()
        {
            return zzQA;
        }

        public zzqp.zzc zzBA()
        {
            return zzaTN;
        }

        public long zzBB()
        {
            return zzaTL;
        }

        public zza zzBx()
        {
            return zzaTJ;
        }

        public byte[] zzBy()
        {
            return zzaTK;
        }

        public zzqi zzBz()
        {
            return zzaTM;
        }

        public zza(Status status, zzqi zzqi, zza zza1)
        {
            this(status, zzqi, null, null, zza1, 0L);
        }

        public zza(Status status, zzqi zzqi, byte abyte0[], zzqp.zzc zzc, zza zza1, long l)
        {
            zzQA = status;
            zzaTM = zzqi;
            zzaTK = abyte0;
            zzaTN = zzc;
            zzaTJ = zza1;
            zzaTL = l;
        }
    }

    public static final class zza.zza extends Enum
    {

        public static final zza.zza zzaTO;
        public static final zza.zza zzaTP;
        public static final zza.zza zzaTQ;
        private static final zza.zza zzaTR[];

        public static zza.zza valueOf(String s)
        {
            return (zza.zza)Enum.valueOf(com/google/android/gms/internal/zzqo$zza$zza, s);
        }

        public static zza.zza[] values()
        {
            return (zza.zza[])zzaTR.clone();
        }

        static 
        {
            zzaTO = new zza.zza("NETWORK", 0);
            zzaTP = new zza.zza("DISK", 1);
            zzaTQ = new zza.zza("DEFAULT", 2);
            zzaTR = (new zza.zza[] {
                zzaTO, zzaTP, zzaTQ
            });
        }

        private zza.zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final zza zzaTI;

    public zzqo(zza zza1)
    {
        zzaTI = zza1;
    }

    public Status getStatus()
    {
        return zzaTI.getStatus();
    }

    public zza zzBw()
    {
        return zzaTI;
    }
}
