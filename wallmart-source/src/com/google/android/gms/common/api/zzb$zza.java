// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.common.api:
//            zzb, ResultCallback, Result, Status

public static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            message = (Pair)message.obj;
            zzb((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
            return;

        case 2: // '\002'
            ((zzb)message.obj).zzw(Status.zzaaG);
            break;
        }
    }

    public void zza(ResultCallback resultcallback, Result result)
    {
        sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
    }

    public void zza(zzb zzb1, long l)
    {
        sendMessageDelayed(obtainMessage(2, zzb1), l);
    }

    protected void zzb(ResultCallback resultcallback, Result result)
    {
        try
        {
            resultcallback.onResult(result);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ResultCallback resultcallback)
        {
            com.google.android.gms.common.api.zzb.zzc(result);
        }
        throw resultcallback;
    }

    public void zzna()
    {
        removeMessages(2);
    }

    public llback()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}
