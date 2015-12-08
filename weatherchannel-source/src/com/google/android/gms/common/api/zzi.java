// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzu;

public final class zzi
{
    private final class zza extends Handler
    {

        final zzi zzXM;

        public void handleMessage(Message message)
        {
            boolean flag = true;
            if (message.what != 1)
            {
                flag = false;
            }
            zzu.zzV(flag);
            zzXM.zzb((zzb)message.obj);
        }

        public zza(Looper looper)
        {
            zzXM = zzi.this;
            super(looper);
        }
    }

    public static interface zzb
    {

        public abstract void zzmw();

        public abstract void zzn(Object obj);
    }


    private volatile Object mListener;
    private final zza zzXL;

    zzi(Looper looper, Object obj)
    {
        zzXL = new zza(looper);
        mListener = zzu.zzb(obj, "Listener must not be null");
    }

    public void clear()
    {
        mListener = null;
    }

    public void zza(zzb zzb1)
    {
        zzu.zzb(zzb1, "Notifier must not be null");
        zzb1 = zzXL.obtainMessage(1, zzb1);
        zzXL.sendMessage(zzb1);
    }

    void zzb(zzb zzb1)
    {
        Object obj = mListener;
        if (obj == null)
        {
            zzb1.zzmw();
            return;
        }
        try
        {
            zzb1.zzn(obj);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb1.zzmw();
            throw runtimeexception;
        }
    }
}
