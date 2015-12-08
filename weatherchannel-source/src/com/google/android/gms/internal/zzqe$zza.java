// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqe, zzpy

public static class zzaPr
{
    public static final class zza extends Enum
    {

        public static final zza zzaPu;
        public static final zza zzaPv;
        public static final zza zzaPw;
        private static final zza zzaPx[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzqe$zza$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaPx.clone();
        }

        static 
        {
            zzaPu = new zza("NETWORK", 0);
            zzaPv = new zza("DISK", 1);
            zzaPw = new zza("DEFAULT", 2);
            zzaPx = (new zza[] {
                zzaPu, zzaPv, zzaPw
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final Status zzOt;
    private final zza zzaPp;
    private final byte zzaPq[];
    private final long zzaPr;
    private final zzpy zzaPs;
    private final zza zzaPt;

    public Status getStatus()
    {
        return zzOt;
    }

    public zza zzAh()
    {
        return zzaPp;
    }

    public byte[] zzAi()
    {
        return zzaPq;
    }

    public zzpy zzAj()
    {
        return zzaPs;
    }

    public zzaPs zzAk()
    {
        return zzaPt;
    }

    public long zzAl()
    {
        return zzaPr;
    }

    public zza(Status status, zzpy zzpy, zza zza1)
    {
        this(status, zzpy, null, null, zza1, 0L);
    }

    public zza(Status status, zzpy zzpy, byte abyte0[], zza zza1, zza zza2, long l)
    {
        zzOt = status;
        zzaPs = zzpy;
        zzaPq = abyte0;
        zzaPt = zza1;
        zzaPp = zza2;
        zzaPr = l;
    }
}
