// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

// Referenced classes of package com.whatsapp.util:
//            aq, a6

class bd
    implements SensorEventListener
{

    final aq a;
    final a6 b;
    private boolean c;

    bd(aq aq1, a6 a6_1)
    {
        a = aq1;
        b = a6_1;
        super();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        boolean flag1 = false;
        float f = sensorevent.values[0];
        boolean flag = flag1;
        if (f < 5F)
        {
            flag = flag1;
            if (f != aq.a(a).getMaximumRange())
            {
                flag = true;
            }
        }
        if (flag != c)
        {
            c = flag;
            b.a(flag);
        }
    }
}
