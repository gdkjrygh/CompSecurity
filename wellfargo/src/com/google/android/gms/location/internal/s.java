// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.p;

class s extends p
{

    private Handler a;

    private void a(int i, Object obj)
    {
        if (a == null)
        {
            Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
            return;
        } else
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            a.sendMessage(message);
            return;
        }
    }

    public void a(LocationAvailability locationavailability)
    {
        a(1, locationavailability);
    }

    public void a(LocationResult locationresult)
    {
        a(0, locationresult);
    }
}
