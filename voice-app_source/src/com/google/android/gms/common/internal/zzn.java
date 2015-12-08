// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzoy;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu

public final class zzn
{

    public static final int zzaaX = 23 - " PII_LOG".length();
    private static final String zzaaY = null;
    private final String zzaaZ;
    private final String zzaba;

    public zzn(String s)
    {
        this(s, zzaaY);
    }

    public zzn(String s, String s1)
    {
        com.google.android.gms.common.internal.zzu.zzb(s, "log tag cannot be null");
        boolean flag;
        if (s.length() <= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzu.zzb(flag, "tag \"%s\" is longer than the %d character maximum", new Object[] {
            s, Integer.valueOf(23)
        });
        zzaaZ = s;
        if (s1 == null || s1.length() <= 0)
        {
            zzaba = zzaaY;
            return;
        } else
        {
            zzaba = s1;
            return;
        }
    }

    private String zzch(String s)
    {
        if (zzaba == null)
        {
            return s;
        } else
        {
            return zzaba.concat(s);
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

        context = new zzoy(context, 10);
        context.zza("GMS_WTF", null, new String[] {
            "GMS_WTF", stringbuilder.toString()
        });
        context.send();
        if (zzbv(7))
        {
            Log.e(s, zzch(s1), throwable);
            Log.wtf(s, zzch(s1), throwable);
        }
    }

    public void zza(String s, String s1, Throwable throwable)
    {
        if (zzbv(4))
        {
            Log.i(s, zzch(s1), throwable);
        }
    }

    public void zzb(String s, String s1, Throwable throwable)
    {
        if (zzbv(5))
        {
            Log.w(s, zzch(s1), throwable);
        }
    }

    public boolean zzbv(int i)
    {
        return Log.isLoggable(zzaaZ, i);
    }

    public void zzc(String s, String s1, Throwable throwable)
    {
        if (zzbv(6))
        {
            Log.e(s, zzch(s1), throwable);
        }
    }

    public void zzt(String s, String s1)
    {
        if (zzbv(3))
        {
            Log.d(s, zzch(s1));
        }
    }

    public void zzu(String s, String s1)
    {
        if (zzbv(5))
        {
            Log.w(s, zzch(s1));
        }
    }

    public void zzv(String s, String s1)
    {
        if (zzbv(6))
        {
            Log.e(s, zzch(s1));
        }
    }

}
