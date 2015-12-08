// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbw, zzby, zzkf

public abstract class zzbv
    implements zzbs
{

    private final String zztw;
    private final Object zztx;

    private zzbv(String s, Object obj)
    {
        zztw = s;
        zztx = obj;
        zzo.zzbD().zza(this);
    }

    zzbv(String s, Object obj, _cls1 _pcls1)
    {
        this(s, obj);
    }

    public static zzbv zzO(String s)
    {
        s = zzc(s, (String)null);
        zzo.zzbD().zza(s);
        return s;
    }

    public static zzbv zzP(String s)
    {
        s = zzc(s, (String)null);
        zzo.zzbD().zzb(s);
        return s;
    }

    public static zzbv zza(String s, int i)
    {
        return new _cls2(s, Integer.valueOf(i));
    }

    public static zzbv zza(String s, Boolean boolean1)
    {
        return new _cls1(s, boolean1);
    }

    public static zzbv zzb(String s, long l)
    {
        return new _cls3(s, Long.valueOf(l));
    }

    public static zzbv zzc(String s, String s1)
    {
        return new _cls4(s, s1);
    }

    public Object get()
    {
        return zzo.zzbE().zzc(this);
    }

    public String getKey()
    {
        return zztw;
    }

    protected abstract Object zza(SharedPreferences sharedpreferences);

    public Object zzcY()
    {
        return zztx;
    }

    public abstract zzkf zzcZ();

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
