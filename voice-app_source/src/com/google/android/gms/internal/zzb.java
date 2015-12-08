// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public interface zzb
{
    public static class zza
    {

        public byte data[];
        public String zzb;
        public long zzc;
        public long zzd;
        public long zze;
        public long zzf;
        public Map zzg;

        public boolean zzb()
        {
            return zze < System.currentTimeMillis();
        }

        public boolean zzc()
        {
            return zzf < System.currentTimeMillis();
        }

        public zza()
        {
            zzg = Collections.emptyMap();
        }
    }


    public abstract zza zza(String s);

    public abstract void zza();

    public abstract void zza(String s, zza zza1);
}
