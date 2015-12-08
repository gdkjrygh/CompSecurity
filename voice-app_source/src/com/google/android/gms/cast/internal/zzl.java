// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.Locale;

public class zzl
{

    private static boolean zzUT = false;
    protected final String mTag;
    private final boolean zzUU;
    private boolean zzUV;
    private boolean zzUW;
    private String zzUX;

    public zzl(String s)
    {
        this(s, zzmb());
    }

    public zzl(String s, boolean flag)
    {
        zzu.zzh(s, "The log tag cannot be null or empty.");
        mTag = s;
        boolean flag1;
        if (s.length() <= 23)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzUU = flag1;
        zzUV = flag;
        zzUW = false;
    }

    public static boolean zzmb()
    {
        return zzUT;
    }

    public void zzS(boolean flag)
    {
        zzUV = flag;
    }

    public transient void zza(String s, Object aobj[])
    {
        if (zzma())
        {
            Log.v(mTag, zzg(s, aobj));
        }
    }

    public transient void zzb(String s, Object aobj[])
    {
        if (zzlZ() || zzUT)
        {
            Log.d(mTag, zzg(s, aobj));
        }
    }

    public transient void zzb(Throwable throwable, String s, Object aobj[])
    {
        if (zzlZ() || zzUT)
        {
            Log.d(mTag, zzg(s, aobj), throwable);
        }
    }

    public void zzbJ(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = String.format("[%s] ", new Object[] {
                s
            });
        }
        zzUX = s;
    }

    public transient void zzc(String s, Object aobj[])
    {
        Log.e(mTag, zzg(s, aobj));
    }

    public transient void zzc(Throwable throwable, String s, Object aobj[])
    {
        Log.w(mTag, zzg(s, aobj), throwable);
    }

    public transient void zze(String s, Object aobj[])
    {
        Log.i(mTag, zzg(s, aobj));
    }

    public transient void zzf(String s, Object aobj[])
    {
        Log.w(mTag, zzg(s, aobj));
    }

    protected transient String zzg(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(Locale.ROOT, s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(zzUX))
        {
            aobj = (new StringBuilder()).append(zzUX).append(s).toString();
        }
        return ((String) (aobj));
    }

    public boolean zzlZ()
    {
        return zzUV || zzUU && Log.isLoggable(mTag, 3);
    }

    public boolean zzma()
    {
        return zzUW;
    }

}
