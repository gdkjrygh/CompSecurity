// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzx;

public final class zzl
{
    private final class zza extends Handler
    {

        final zzl zzaaA;

        public void handleMessage(Message message)
        {
            boolean flag = true;
            if (message.what != 1)
            {
                flag = false;
            }
            zzx.zzZ(flag);
            zzaaA.zzb((zzb)message.obj);
        }

        public zza(Looper looper)
        {
            zzaaA = zzl.this;
            super(looper);
        }
    }

    public static interface zzb
    {

        public abstract void zznh();

        public abstract void zzo(Object obj);
    }


    private volatile Object mListener;
    private final zza zzaaz;

    zzl(Looper looper, Object obj)
    {
        zzaaz = new zza(looper);
        mListener = zzx.zzb(obj, "Listener must not be null");
    }

    public void clear()
    {
        mListener = null;
    }

    public void zza(zzb zzb1)
    {
        zzx.zzb(zzb1, "Notifier must not be null");
        zzb1 = zzaaz.obtainMessage(1, zzb1);
        zzaaz.sendMessage(zzb1);
    }

    void zzb(zzb zzb1)
    {
        Object obj = mListener;
        if (obj == null)
        {
            zzb1.zznh();
            return;
        }
        try
        {
            zzb1.zzo(obj);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb1.zznh();
            throw runtimeexception;
        }
    }
}
