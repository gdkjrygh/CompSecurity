// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzi

private static class ity extends com.google.android.gms.location..zzi.zza
{

    private Handler zzaCN;

    private void zzb(int i, Object obj)
    {
        if (zzaCN == null)
        {
            Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            zzaCN.sendMessage(message);
            return;
        }
    }

    public void onLocationAvailability(LocationAvailability locationavailability)
    {
        zzb(1, locationavailability);
    }

    public void onLocationResult(LocationResult locationresult)
    {
        zzb(0, locationresult);
    }

    public void release()
    {
        zzaCN = null;
    }

    _cls1.zzaCG(LocationCallback locationcallback, Looper looper)
    {
        Looper looper1 = looper;
        if (looper == null)
        {
            looper1 = Looper.myLooper();
            boolean flag;
            if (looper1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
        }
        zzaCN = new Handler(looper1, locationcallback) {

            final LocationCallback zzaCG;
            final zzi.zza zzaCO;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 0: // '\0'
                    zzaCG.onLocationResult((LocationResult)message.obj);
                    return;

                case 1: // '\001'
                    zzaCG.onLocationAvailability((LocationAvailability)message.obj);
                    break;
                }
            }

            
            {
                zzaCO = zzi.zza.this;
                zzaCG = locationcallback;
                super(looper);
            }
        };
    }
}
