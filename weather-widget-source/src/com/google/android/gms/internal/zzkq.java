// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzkq
{
    private static interface zza
    {

        public abstract Long getLong(String s, Long long1);

        public abstract String getString(String s, String s1);

        public abstract Boolean zzb(String s, Boolean boolean1);

        public abstract Float zzb(String s, Float float1);

        public abstract Integer zzb(String s, Integer integer);
    }


    private static zza zzaaX = null;
    private static int zzaaY = 0;
    private static String zzaaZ = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private static final Object zzpm = new Object();
    private Object zzNR;
    protected final String zztP;
    protected final Object zztQ;

    protected zzkq(String s, Object obj)
    {
        zzNR = null;
        zztP = s;
        zztQ = obj;
    }

    public static boolean isInitialized()
    {
        return zzaaX != null;
    }

    public static zzkq zza(String s, Float float1)
    {
        return new zzkq(s, float1) {

            protected Object zzbX(String s1)
            {
                return zzcb(s1);
            }

            protected Float zzcb(String s1)
            {
                return zzkq.zznO().zzb(zztP, (Float)zztQ);
            }

        };
    }

    public static zzkq zza(String s, Integer integer)
    {
        return new zzkq(s, integer) {

            protected Object zzbX(String s1)
            {
                return zzca(s1);
            }

            protected Integer zzca(String s1)
            {
                return zzkq.zznO().zzb(zztP, (Integer)zztQ);
            }

        };
    }

    public static zzkq zza(String s, Long long1)
    {
        return new zzkq(s, long1) {

            protected Object zzbX(String s1)
            {
                return zzbZ(s1);
            }

            protected Long zzbZ(String s1)
            {
                return zzkq.zznO().getLong(zztP, (Long)zztQ);
            }

        };
    }

    public static zzkq zzg(String s, boolean flag)
    {
        return new zzkq(s, Boolean.valueOf(flag)) {

            protected Object zzbX(String s1)
            {
                return zzbY(s1);
            }

            protected Boolean zzbY(String s1)
            {
                return zzkq.zznO().zzb(zztP, (Boolean)zztQ);
            }

        };
    }

    public static int zznM()
    {
        return zzaaY;
    }

    static zza zznO()
    {
        return zzaaX;
    }

    public static zzkq zzu(String s, String s1)
    {
        return new zzkq(s, s1) {

            protected Object zzbX(String s2)
            {
                return zzcc(s2);
            }

            protected String zzcc(String s2)
            {
                return zzkq.zznO().getString(zztP, (String)zztQ);
            }

        };
    }

    public final Object get()
    {
        if (zzNR != null)
        {
            return zzNR;
        } else
        {
            return zzbX(zztP);
        }
    }

    protected abstract Object zzbX(String s);

    public final Object zznN()
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
