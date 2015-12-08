// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqo, zzqi

public static class zzaTL
{
    public static final class zza extends Enum
    {

        public static final zza zzaTO;
        public static final zza zzaTP;
        public static final zza zzaTQ;
        private static final zza zzaTR[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzqo$zza$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaTR.clone();
        }

        static 
        {
            zzaTO = new zza("NETWORK", 0);
            zzaTP = new zza("DISK", 1);
            zzaTQ = new zza("DEFAULT", 2);
            zzaTR = (new zza[] {
                zzaTO, zzaTP, zzaTQ
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status zzQA;
    private final zza zzaTJ;
    private final byte zzaTK[];
    private final long zzaTL;
    private final zzqi zzaTM;
    private final zza zzaTN;

    public Status getStatus()
    {
        return zzQA;
    }

    public zzQA zzBA()
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

    public zza(Status status, zzqi zzqi, byte abyte0[], zza zza1, zza zza2, long l)
    {
        zzQA = status;
        zzaTM = zzqi;
        zzaTK = abyte0;
        zzaTN = zza1;
        zzaTJ = zza2;
        zzaTL = l;
    }
}
