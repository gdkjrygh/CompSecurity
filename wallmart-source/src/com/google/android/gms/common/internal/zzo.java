// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzpl;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx

public final class zzo
{

    public static final int zzaeh = 23 - " PII_LOG".length();
    private static final String zzaei = null;
    private final String zzaej;
    private final String zzaek;

    public zzo(String s)
    {
        this(s, zzaei);
    }

    public zzo(String s, String s1)
    {
        com.google.android.gms.common.internal.zzx.zzb(s, "log tag cannot be null");
        boolean flag;
        if (s.length() <= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzx.zzb(flag, "tag \"%s\" is longer than the %d character maximum", new Object[] {
            s, Integer.valueOf(23)
        });
        zzaej = s;
        if (s1 == null || s1.length() <= 0)
        {
            zzaek = zzaei;
            return;
        } else
        {
            zzaek = s1;
            return;
        }
    }

    private String zzcq(String s)
    {
        if (zzaek == null)
        {
            return s;
        } else
        {
            return zzaek.concat(s);
        }
    }

    public void zza(Context context, String s, String s1, Throwable throwable)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < astacktraceelement.length && i < 2; i++)
        {
            stringbuilder.append(astacktraceelement[i].toString());
            stringbuilder.append("\n");
        }

        context = new zzpl(context, 10);
        context.zza("GMS_WTF", null, new String[] {
            "GMS_WTF", stringbuilder.toString()
        });
        context.send();
        if (zzbC(7))
        {
            Log.e(s, zzcq(s1), throwable);
            Log.wtf(s, zzcq(s1), throwable);
        }
    }

    public void zza(String s, String s1, Throwable throwable)
    {
        if (zzbC(4))
        {
            Log.i(s, zzcq(s1), throwable);
        }
    }

    public void zzb(String s, String s1, Throwable throwable)
    {
        if (zzbC(5))
        {
            Log.w(s, zzcq(s1), throwable);
        }
    }

    public boolean zzbC(int i)
    {
        return Log.isLoggable(zzaej, i);
    }

    public void zzc(String s, String s1, Throwable throwable)
    {
        if (zzbC(6))
        {
            Log.e(s, zzcq(s1), throwable);
        }
    }

    public void zzv(String s, String s1)
    {
        if (zzbC(3))
        {
            Log.d(s, zzcq(s1));
        }
    }

    public void zzw(String s, String s1)
    {
        if (zzbC(5))
        {
            Log.w(s, zzcq(s1));
        }
    }

    public void zzx(String s, String s1)
    {
        if (zzbC(6))
        {
            Log.e(s, zzcq(s1));
        }
    }

}
