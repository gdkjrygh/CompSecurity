// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.weather.dal2.system.AppEvent;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.dal2.sensors:
//            IPressureSensor

public class PressureSensor
    implements SensorEventListener, IPressureSensor
{

    private static final PressureSensor INSTANCE = new PressureSensor(AbstractTwcApplication.getRootContext());
    private final SensorManager mSensorManager;
    private final Sensor pSensor;
    private Double pressure;

    PressureSensor(Context context)
    {
        mSensorManager = (SensorManager)context.getSystemService("sensor");
        if (mSensorManager != null)
        {
            context = mSensorManager.getDefaultSensor(6);
        } else
        {
            context = null;
        }
        pSensor = context;
    }

    public static PressureSensor getInstance()
    {
        return INSTANCE;
    }

    public Double getPressure()
    {
        return pressure;
    }

    public boolean hasSensor()
    {
        return pSensor != null;
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onResume(AppEvent appevent)
    {
        if (!hasSensor()) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.weather.dal2.system.AppEvent.Cause[appevent.getCause().ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 41
    //                   2 56;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        mSensorManager.registerListener(this, pSensor, 3);
        return;
_L4:
        mSensorManager.unregisterListener(this);
        return;
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (sensorevent.values.length > 0)
        {
            pressure = Double.valueOf(sensorevent.values[0]);
        }
    }


    /* member class not found */
    class _cls1 {}

}
