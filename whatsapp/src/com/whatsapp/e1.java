// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

// Referenced classes of package com.whatsapp:
//            App, akr

class e1
    implements SensorEventListener
{

    final akr a;

    e1(akr akr1)
    {
        a = akr1;
        super();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
label0:
        {
            int i = App.am;
            if (akr.g == null)
            {
                a.a(false);
                akr.a(a);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (akr.g != a)
            {
                akr.a(a);
                if (i == 0)
                {
                    break label0;
                }
            }
            float f = sensorevent.values[0];
            if (f >= 5F || f == akr.b(a).getMaximumRange())
            {
                a.a(false);
                if (i == 0)
                {
                    break label0;
                }
            }
            a.a(true);
        }
    }
}
