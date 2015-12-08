// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a
{

    private static SensorManager a = null;
    private static Sensor b = null;
    private static Sensor c = null;
    private static volatile float d[];
    private static volatile float e[];
    private static Map f = new ConcurrentHashMap();
    private static String g[] = {
        "x", "y", "z"
    };

    public static Map a()
    {
        HashMap hashmap = new HashMap();
        hashmap.putAll(f);
        a(((Map) (hashmap)));
        return hashmap;
    }

    public static void a(Context context)
    {
        com/facebook/ads/a/a;
        JVM INSTR monitorenter ;
        b(context);
        c(context);
        d(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        a = (SensorManager)context.getSystemService("sensor");
        context = a;
        if (context != null) goto _L2; else goto _L3
_L3:
        com/facebook/ads/a/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b == null)
        {
            b = a.getDefaultSensor(1);
        }
        if (c == null)
        {
            c = a.getDefaultSensor(4);
        }
        if (b != null)
        {
            a.registerListener(new a(null), b, 3);
        }
        if (c != null)
        {
            a.registerListener(new a(null), c, 3);
        }
        if (true) goto _L3; else goto _L4
_L4:
        context;
        throw context;
    }

    public static void a(a a1)
    {
        com/facebook/ads/a/a;
        JVM INSTR monitorenter ;
        SensorManager sensormanager = a;
        if (sensormanager != null) goto _L2; else goto _L1
_L1:
        com/facebook/ads/a/a;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.unregisterListener(a1);
        if (true) goto _L1; else goto _L3
_L3:
        a1;
        throw a1;
    }

    private static void a(Map map)
    {
        boolean flag = false;
        float af[] = d;
        float af1[] = e;
        if (af != null)
        {
            int k = Math.min(g.length, af.length);
            for (int i = 0; i < k; i++)
            {
                map.put((new StringBuilder()).append("accelerometer_").append(g[i]).toString(), Float.valueOf(af[i]));
            }

        }
        if (af1 != null)
        {
            int l = Math.min(g.length, af1.length);
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                map.put((new StringBuilder()).append("rotation_").append(g[j]).toString(), Float.valueOf(af1[j]));
            }

        }
    }

    static float[] a(float af[])
    {
        d = af;
        return af;
    }

    static Sensor b()
    {
        return b;
    }

    private static void b(Context context)
    {
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        f.put("available_memory", String.valueOf(memoryinfo.availMem));
    }

    static float[] b(float af[])
    {
        e = af;
        return af;
    }

    static Sensor c()
    {
        return c;
    }

    private static void c(Context context)
    {
        context = new StatFs(Environment.getDataDirectory().getPath());
        long l = context.getBlockSize();
        long l1 = context.getAvailableBlocks();
        f.put("free_space", Long.valueOf(l1 * l));
    }

    private static void d(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null)
        {
            return;
        }
        int j = context.getIntExtra("level", -1);
        int k = context.getIntExtra("scale", -1);
        int i = context.getIntExtra("status", -1);
        float f1;
        if (i == 2 || i == 5)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        f1 = 0.0F;
        if (k > 0)
        {
            f1 = ((float)j / (float)k) * 100F;
        }
        f.put("battery", Float.valueOf(f1));
        context = f;
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        context.put("charging", Integer.valueOf(i));
    }


    private class a
        implements SensorEventListener
    {

        public void onAccuracyChanged(Sensor sensor, int i)
        {
        }

        public void onSensorChanged(SensorEvent sensorevent)
        {
            if (sensorevent.sensor != com.facebook.ads.a.a.b()) goto _L2; else goto _L1
_L1:
            com.facebook.ads.a.a.a(sensorevent.values);
_L4:
            com.facebook.ads.a.a.a(this);
            return;
_L2:
            if (sensorevent.sensor == com.facebook.ads.a.a.c())
            {
                com.facebook.ads.a.a.b(sensorevent.values);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private a()
        {
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }

}
