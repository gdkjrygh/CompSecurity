// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            WeatherTrendView, TemperatureCubeView

class ag
    implements SensorEventListener
{

    final WeatherTrendView a;
    private float b;
    private float c;
    private float d;
    private float e;

    ag(WeatherTrendView weathertrendview)
    {
        a = weathertrendview;
        super();
        d = 1.0F;
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        int i = 0;
        if (!a.mCubeViewDrawingCacheEnabled) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (WeatherTrendView.access$000(a) != 0) goto _L4; else goto _L3
_L3:
        b = -sensorevent.values[0];
_L5:
        if (Math.abs(b - c) > 0.05F)
        {
            c = c * 0.85F + b * 0.15F;
            if (Math.abs(c) > d)
            {
                e = c;
                TemperatureCubeView temperaturecubeview;
                int j;
                if (c < 0.0F)
                {
                    e = c + d;
                } else
                {
                    e = c - d;
                }
            }
        }
        sensorevent = WeatherTrendView.access$100(a);
        j = sensorevent.length;
        while (i < j) 
        {
            temperaturecubeview = sensorevent[i];
            if (temperaturecubeview != null)
            {
                temperaturecubeview.updateAngleByAccelerometer(e);
            }
            i++;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (WeatherTrendView.access$000(a) == 1)
        {
            b = sensorevent.values[1];
        } else
        if (WeatherTrendView.access$000(a) == 2)
        {
            b = sensorevent.values[0];
        } else
        if (WeatherTrendView.access$000(a) == 3)
        {
            b = -sensorevent.values[1];
        }
          goto _L5
    }
}
