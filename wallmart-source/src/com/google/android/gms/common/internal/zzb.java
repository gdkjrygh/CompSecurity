// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class zzb
{

    public static void zzY(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void zza(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static void zzch(String s)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder()).append("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void zzci(String s)
    {
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            Log.e("Asserts", (new StringBuilder()).append("checkNotMainThread: current thread ").append(Thread.currentThread()).append(" IS the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString());
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static void zzr(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null reference");
        } else
        {
            return;
        }
    }
}
