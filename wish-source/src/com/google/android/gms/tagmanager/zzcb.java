// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzcb
{
    static final class zza extends Enum
    {

        public static final zza zzaEu;
        public static final zza zzaEv;
        public static final zza zzaEw;
        private static final zza zzaEx[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaEx.clone();
        }

        static 
        {
            zzaEu = new zza("NONE", 0);
            zzaEv = new zza("CONTAINER", 1);
            zzaEw = new zza("CONTAINER_DEBUG", 2);
            zzaEx = (new zza[] {
                zzaEu, zzaEv, zzaEw
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private static zzcb zzaEq;
    private volatile String zzaCk;
    private volatile zza zzaEr;
    private volatile String zzaEs;
    private volatile String zzaEt;

    zzcb()
    {
        clear();
    }

    static zzcb zzxj()
    {
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if (zzaEq == null)
        {
            zzaEq = new zzcb();
        }
        zzcb1 = zzaEq;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        return zzcb1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        zzaEr = zza.zzaEu;
        zzaEs = null;
        zzaCk = null;
        zzaEt = null;
    }

    String getContainerId()
    {
        return zzaCk;
    }

    zza zzxk()
    {
        return zzaEr;
    }

    String zzxl()
    {
        return zzaEs;
    }
}
