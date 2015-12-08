// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzi

class zzayE extends Handler
{

    final LocationCallback zzayE;
    final y zzayP;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            zzayE.onLocationResult((LocationResult)message.obj);
            return;

        case 1: // '\001'
            zzayE.onLocationAvailability((LocationAvailability)message.obj);
            break;
        }
    }

    y(y y, Looper looper, LocationCallback locationcallback)
    {
        zzayP = y;
        zzayE = locationcallback;
        super(looper);
    }
}
