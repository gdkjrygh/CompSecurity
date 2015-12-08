// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


interface zzbf
{
    public static final class zza extends Enum
    {

        public static final zza zzaQC;
        public static final zza zzaQD;
        public static final zza zzaQE;
        private static final zza zzaQF[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzbf$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaQF.clone();
        }

        static 
        {
            zzaQC = new zza("NOT_AVAILABLE", 0);
            zzaQD = new zza("IO_ERROR", 1);
            zzaQE = new zza("SERVER_ERROR", 2);
            zzaQF = (new zza[] {
                zzaQC, zzaQD, zzaQE
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void zzB(Object obj);

    public abstract void zza(zza zza1);

    public abstract void zzzL();
}
