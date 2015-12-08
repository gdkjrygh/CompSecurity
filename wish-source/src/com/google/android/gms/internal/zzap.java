// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzam, zzaq, zzas, zzhc

public abstract class zzap
    implements zzam
{

    private final String zzra;
    private final Object zzrb;

    private zzap(String s, Object obj)
    {
        zzra = s;
        zzrb = obj;
        zzh.zzaX().zza(this);
    }


    public static zzap zzC(String s)
    {
        s = zzd(s, (String)null);
        zzh.zzaX().zza(s);
        return s;
    }

    public static zzap zzD(String s)
    {
        s = zzd(s, (String)null);
        zzh.zzaX().zza(s);
        return s;
    }

    public static zzap zza(String s, int i)
    {
        return new zzap(s, Integer.valueOf(i)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzc(sharedpreferences);
            }

            public Integer zzc(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)zzcd()).intValue()));
            }

            public zzhc zzce()
            {
                return zzhc.zza(getKey(), (Integer)zzcd());
            }

        };
    }

    public static zzap zza(String s, long l)
    {
        return new zzap(s, Long.valueOf(l)) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzd(sharedpreferences);
            }

            public zzhc zzce()
            {
                return zzhc.zza(getKey(), (Long)zzcd());
            }

            public Long zzd(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)zzcd()).longValue()));
            }

        };
    }

    public static zzap zza(String s, Boolean boolean1)
    {
        return new zzap(s, boolean1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zzb(sharedpreferences);
            }

            public Boolean zzb(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(getKey(), ((Boolean)zzcd()).booleanValue()));
            }

            public zzhc zzce()
            {
                return zzhc.zzg(getKey(), ((Boolean)zzcd()).booleanValue());
            }

        };
    }

    public static zzap zzd(String s, String s1)
    {
        return new zzap(s, s1) {

            public Object zza(SharedPreferences sharedpreferences)
            {
                return zze(sharedpreferences);
            }

            public zzhc zzce()
            {
                return zzhc.zzr(getKey(), (String)zzcd());
            }

            public String zze(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(getKey(), (String)zzcd());
            }

        };
    }

    public Object get()
    {
        return zzh.zzaY().zzb(this);
    }

    public String getKey()
    {
        return zzra;
    }

    protected abstract Object zza(SharedPreferences sharedpreferences);

    public Object zzcd()
    {
        return zzrb;
    }

    public abstract zzhc zzce();
}
