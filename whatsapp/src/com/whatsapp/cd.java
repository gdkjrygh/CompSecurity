// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Handler;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            fz, App, my, oy, 
//            al2

class cd
    implements Runnable
{

    private Location a;
    private fz b;

    public cd(fz fz1, Location location)
    {
        b = fz1;
        a = location;
        fz1.e = location.getLatitude();
        fz1.d = location.getLongitude();
        fz1.i = location.getAccuracy();
    }

    public void run()
    {
        Object obj = new Geocoder(App.au, Locale.getDefault());
        obj = ((Geocoder) (obj)).getFromLocation(a.getLatitude(), a.getLongitude(), 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        boolean flag = ((List) (obj)).isEmpty();
        Exception exception;
        if (!flag)
        {
            try
            {
                obj = (Address)((List) (obj)).get(0);
                b.l = ((Address) (obj)).getLocality();
            }
            catch (Exception exception1) { }
        }
        my.f().a(b.f, b.e, b.d, b.i, b.l);
        App.au.ab().post(new al2(this));
        return;
        exception;
        throw exception;
    }
}
