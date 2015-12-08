// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzhc
{
    private static interface zza
    {

        public abstract Long getLong(String s, Long long1);

        public abstract String getString(String s, String s1);

        public abstract Boolean zzb(String s, Boolean boolean1);

        public abstract Float zzb(String s, Float float1);

        public abstract Integer zzb(String s, Integer integer);
    }


    private static zza zzRo = null;
    private static int zzRp = 0;
    private static final Object zznu = new Object();
    private Object zzHW;
    protected final String zzra;
    protected final Object zzrb;

    protected zzhc(String s, Object obj)
    {
        zzHW = null;
        zzra = s;
        zzrb = obj;
    }

    public static boolean isInitialized()
    {
        return zzRo != null;
    }

    public static zzhc zza(String s, Float float1)
    {
        return new zzhc(s, float1) {

            protected Float zzbD(String s1)
            {
                return zzhc.zzlk().zzb(zzra, (Float)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return zzbD(s1);
            }

        };
    }

    public static zzhc zza(String s, Integer integer)
    {
        return new zzhc(s, integer) {

            protected Integer zzbC(String s1)
            {
                return zzhc.zzlk().zzb(zzra, (Integer)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return zzbC(s1);
            }

        };
    }

    public static zzhc zza(String s, Long long1)
    {
        return new zzhc(s, long1) {

            protected Long zzbB(String s1)
            {
                return zzhc.zzlk().getLong(zzra, (Long)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return zzbB(s1);
            }

        };
    }

    public static zzhc zzg(String s, boolean flag)
    {
        return new zzhc(s, Boolean.valueOf(flag)) {

            protected Boolean zzbA(String s1)
            {
                return zzhc.zzlk().zzb(zzra, (Boolean)zzrb);
            }

            protected Object zzbz(String s1)
            {
                return zzbA(s1);
            }

        };
    }

    public static int zzli()
    {
        return zzRp;
    }

    static zza zzlk()
    {
        return zzRo;
    }

    public static zzhc zzr(String s, String s1)
    {
        return new zzhc(s, s1) {

            protected String zzbE(String s2)
            {
                return zzhc.zzlk().getString(zzra, (String)zzrb);
            }

            protected Object zzbz(String s2)
            {
                return zzbE(s2);
            }

        };
    }

    public final Object get()
    {
        if (zzHW != null)
        {
            return zzHW;
        } else
        {
            return zzbz(zzra);
        }
    }

    protected abstract Object zzbz(String s);

    public final Object zzlj()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = get();
        Binder.restoreCallingIdentity(l);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

}
