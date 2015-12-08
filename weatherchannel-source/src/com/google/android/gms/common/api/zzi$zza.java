// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.api:
//            zzi

private final class zzXM extends Handler
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
        zzXM.zzb((zzXM)message.obj);
    }

    public (zzi zzi1, Looper looper)
    {
        zzXM = zzi1;
        super(looper);
    }
}
