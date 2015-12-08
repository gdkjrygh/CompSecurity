// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzbv, zzbx

public abstract class zzbu
{

    private final String zztP;
    private final Object zztQ;

    private zzbu(String s, Object obj)
    {
        zztP = s;
        zztQ = obj;
        zzp.zzbF().zza(this);
    }


    public static zzbu zzP(String s)
    {
        s = zzc(s, (String)null);
        zzp.zzbF().zzb(s);
        return s;
    }

    public static zzbu zzQ(String s)
    {
        s = zzc(s, (String)null);
        zzp.zzbF().zzc(s);
        return s;
    }

    public static zzbu zza(String s, int i)
    {
        return new zzbu(s, Integer.valueOf(i)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzc(sharedpreferences);
            }

            public Integer zzc(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)zzdd()).intValue()));
            }

        };
    }

    public static zzbu zza(String s, Boolean boolean1)
    {
        return new zzbu(s, boolean1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzb(sharedpreferences);
            }

            public Boolean zzb(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(getKey(), ((Boolean)zzdd()).booleanValue()));
            }

        };
    }

    public static zzbu zzb(String s, long l)
    {
        return new zzbu(s, Long.valueOf(l)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzd(sharedpreferences);
            }

            public Long zzd(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)zzdd()).longValue()));
            }

        };
    }

    public static zzbu zzc(String s, String s1)
    {
        return new zzbu(s, s1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zze(sharedpreferences);
            }

            public String zze(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(getKey(), (String)zzdd());
            }

        };
    }

    public Object get()
    {
        return zzp.zzbG().zzd(this);
    }

    public String getKey()
    {
        return zztP;
    }

    protected abstract Object zza(SharedPreferences sharedpreferences);

    public Object zzdd()
    {
        return zztQ;
    }
}
