// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.squareup.otto.Bus;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            s

class d
    implements SensorEventListener
{

    private static final float a = (float)Math.toRadians(180D);
    private static final float b = (float)Math.toRadians(90D);
    private static final float c = (float)Math.toRadians(75D);
    private static final float d = (float)Math.toRadians(60D);
    private static final float e = (float)Math.toRadians(30D);
    private static final float f = (float)Math.toRadians(15D);
    private float A;
    private float B[];
    private float C[];
    private float D[];
    private float E[];
    private boolean F;
    private int G;
    private final a H;
    private b I;
    private int J;
    private final Bus g;
    private final Object h;
    private boolean i;
    private float j[];
    private SensorManager k;
    private Sensor l;
    private Sensor m;
    private int n;
    private boolean o;
    private long p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public d(Context context, SensorManager sensormanager)
    {
        this(context, sensormanager, null);
    }

    public d(Context context, SensorManager sensormanager, Bus bus)
    {
        h = new Object();
        i = false;
        j = new float[16];
        z = 7F;
        A = 7F;
        D = new float[16];
        E = new float[9];
        F = false;
        G = 0;
        H = new a(null);
        I = b.a;
        J = 75;
        k = sensormanager;
        sensormanager = bus;
        if (bus == null)
        {
            sensormanager = com.kofax.kmc.kui.uicontrols.s.a(context);
        }
        g = sensormanager;
        l = k.getDefaultSensor(11);
        if (l == null || I == b.b)
        {
            F = true;
            l = k.getDefaultSensor(1);
            m = k.getDefaultSensor(2);
        }
        g.register(H);
    }

    static float a(d d1)
    {
        return d1.s;
    }

    static float a(d d1, float f1)
    {
        d1.x = f1;
        return f1;
    }

    static int a(d d1, int i1)
    {
        d1.G = i1;
        return i1;
    }

    private static void a(float af[], float af1[])
    {
        float f2 = af1[0];
        float f3 = af1[1];
        float f4 = af1[2];
        float f1;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (af1.length == 4)
        {
            f1 = af1[3];
        } else
        {
            f1 = 1.0F - f2 * f2 - f3 * f3 - f4 * f4;
            if (f1 > 0.0F)
            {
                f1 = (float)Math.sqrt(f1);
            } else
            {
                f1 = 0.0F;
            }
        }
        f5 = 2.0F * f2 * f2;
        f6 = 2.0F * f3 * f3;
        f7 = 2.0F * f4 * f4;
        f8 = 2.0F * f2 * f3;
        f9 = 2.0F * f4 * f1;
        f10 = 2.0F * f2 * f4;
        f11 = 2.0F * f3 * f1;
        f3 = f3 * 2.0F * f4;
        f1 *= f2 * 2.0F;
        if (af.length == 9)
        {
            af[0] = 1.0F - f6 - f7;
            af[1] = f8 - f9;
            af[2] = f10 + f11;
            af[3] = f8 + f9;
            af[4] = 1.0F - f5 - f7;
            af[5] = f3 - f1;
            af[6] = f10 - f11;
            af[7] = f1 + f3;
            af[8] = 1.0F - f5 - f6;
        } else
        if (af.length == 16)
        {
            af[0] = 1.0F - f6 - f7;
            af[1] = f8 - f9;
            af[2] = f10 + f11;
            af[3] = 0.0F;
            af[4] = f8 + f9;
            af[5] = 1.0F - f5 - f7;
            af[6] = f3 - f1;
            af[7] = 0.0F;
            af[8] = f10 - f11;
            af[9] = f1 + f3;
            af[10] = 1.0F - f5 - f6;
            af[11] = 0.0F;
            af[14] = 0.0F;
            af[13] = 0.0F;
            af[12] = 0.0F;
            af[15] = 1.0F;
            return;
        }
    }

    static float b(d d1)
    {
        return d1.x;
    }

    static float b(d d1, float f1)
    {
        d1.y = f1;
        return f1;
    }

    static int b(d d1, int i1)
    {
        d1.J = i1;
        return i1;
    }

    static float c(d d1)
    {
        return d1.t;
    }

    static float c(d d1, float f1)
    {
        d1.z = f1;
        return f1;
    }

    static float d(d d1)
    {
        return d1.y;
    }

    static float d(d d1, float f1)
    {
        d1.A = f1;
        return f1;
    }

    static float e(d d1)
    {
        return d1.v;
    }

    static float f(d d1)
    {
        return d1.u;
    }

    static float g(d d1)
    {
        return d1.w;
    }

    static Bus h(d d1)
    {
        return d1.g;
    }

    public void a()
    {
        if (i)
        {
            return;
        }
        synchronized (h)
        {
            if (!i)
            {
                break MISSING_BLOCK_LABEL_30;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i = true;
        k.registerListener(this, l, 2);
        if (F)
        {
            k.registerListener(this, m, 2);
        }
        obj;
        JVM INSTR monitorexit ;
    }

    void a(Sensor sensor, float af[])
    {
        if (F ? sensor.getType() != 1 && sensor.getType() != 2 : sensor.getType() != 11) goto _L2; else goto _L1
_L2:
        return;
_L1:
        long l1;
        long l2;
        l1 = System.currentTimeMillis();
        l2 = l1 - p;
        if (l2 < 100L) goto _L2; else goto _L3
_L3:
        q = s;
        r = t;
        if (!F) goto _L5; else goto _L4
_L4:
        sensor.getType();
        JVM INSTR tableswitch 1 2: default 104
    //                   1 482
    //                   2 496;
           goto _L6 _L7 _L8
_L6:
        if (B == null || C == null || !SensorManager.getRotationMatrix(D, null, B, C)) goto _L2; else goto _L9
_L9:
        char c1;
        int i1;
        boolean flag;
        byte byte0;
        flag = true;
        byte0 = 2;
        c1 = byte0;
        i1 = ((flag) ? 1 : 0);
        G;
        JVM INSTR tableswitch 0 3: default 184
    //                   0 192
    //                   1 521
    //                   2 532
    //                   3 545;
           goto _L10 _L11 _L12 _L13 _L14
_L11:
        break; /* Loop/switch isn't completed */
_L10:
        i1 = ((flag) ? 1 : 0);
        c1 = byte0;
_L15:
        SensorManager.remapCoordinateSystem(D, i1, c1, j);
        SensorManager.getOrientation(j, E);
        s = -E[1];
        t = E[2];
        float f5 = Math.abs(s);
        float f4 = Math.abs(t);
        float f1 = f4;
        if (f4 > b)
        {
            f1 = f4 + (b - f4);
        }
        boolean flag1;
        boolean flag2;
        if (f5 > c)
        {
            c1 = '\001';
        } else
        {
            c1 = '\0';
        }
        if (f5 > d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f5 < e)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f1 > c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (c1 != 0)
        {
            t = 0.0F;
        } else
        if (i1 != 0)
        {
            float f3 = 1.0F - (f5 - d) / f;
            if (t < -b)
            {
                t = f3 * (t + a) - a;
            } else
            if (t > b)
            {
                t = f3 * (t - a) + a;
            } else
            {
                t = f3 * t;
            }
        } else
        if (flag2 && flag1)
        {
            s = 0.0F;
        }
        if (p > 0L)
        {
            float f2 = (float)l2 / 1000F;
            u = (t - (float)Math.toRadians(r)) / f2;
            v = (s - (float)Math.toRadians(q)) / f2;
            w = Math.round(Math.max(Math.max(100F - Math.abs(u) * 200F, 100F - Math.abs(v) * 200F), 0.0D));
            o = true;
        }
        s = (float)Math.toDegrees(s);
        t = (float)Math.toDegrees(t);
        p = l1;
        H.c();
        return;
_L7:
        B = (float[])af.clone();
          goto _L6
_L8:
        C = (float[])af.clone();
          goto _L6
_L5:
        a(D, af);
          goto _L9
_L12:
        i1 = 2;
        c1 = '\201';
          goto _L15
_L13:
        i1 = 129;
        c1 = '\202';
          goto _L15
_L14:
        i1 = 130;
        c1 = '\001';
          goto _L15
    }

    public void b()
    {
        if (!i)
        {
            return;
        }
        synchronized (h)
        {
            if (i)
            {
                break MISSING_BLOCK_LABEL_30;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        k.unregisterListener(this);
        i = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public boolean c()
    {
        float f2 = 1000F;
        float f1;
        if (Math.round(A) < 45)
        {
            f1 = A;
        } else
        {
            f1 = 1000F;
        }
        if (Math.round(z) < 45)
        {
            f2 = z;
        }
        return p > 0L && Math.abs(t - y) < f1 && Math.abs(s - x) < f2;
    }

    public boolean d()
    {
        if (J != 0)
        {
            double d1 = (100.40000000000001D - (double)J) / 200D;
            if (!o || (double)Math.abs(u) > d1 || (double)Math.abs(v) > d1)
            {
                return false;
            }
        }
        return true;
    }

    public float e()
    {
        return s;
    }

    public float f()
    {
        return t;
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
        if (i1 != n)
        {
            n = i1;
        }
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        a(sensorevent.sensor, sensorevent.values);
    }


    private class a
    {

        final d a;

        public BusEvents.LevelChangedEvent a()
        {
            return new BusEvents.LevelChangedEvent(a.c(), d.a(a) - d.b(a), d.c(a) - d.d(a), d.e(a), d.f(a));
        }

        public void a(BusEvents.DeviceDeclinationPitchEvent devicedeclinationpitchevent)
        {
            int i1 = devicedeclinationpitchevent.deviceDeclinationPitch;
            if (i1 < -180 || i1 > 180)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_DECLINATION_ARGUMENT);
            } else
            {
                d.a(a, i1);
                return;
            }
        }

        public void a(BusEvents.DeviceDeclinationRollEvent devicedeclinationrollevent)
        {
            int i1 = devicedeclinationrollevent.deviceDeclinationRoll;
            if (i1 < -180 || i1 > 180)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_DECLINATION_ARGUMENT);
            } else
            {
                d.b(a, i1);
                return;
            }
        }

        public void a(BusEvents.DisplayOrientationChangedEvent displayorientationchangedevent)
        {
            d.a(a, displayorientationchangedevent.rotation);
        }

        public void a(BusEvents.PitchThresholdChangedEvent pitchthresholdchangedevent)
        {
            int i1 = pitchthresholdchangedevent.threshold;
            if (i1 < 0 || i1 > 45)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
            } else
            {
                d.c(a, i1);
                return;
            }
        }

        public void a(BusEvents.RollThresholdChangedEvent rollthresholdchangedevent)
        {
            int i1 = rollthresholdchangedevent.threshold;
            if (i1 < 0 || i1 > 45)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_THRESHOLD_ARGUMENT);
            } else
            {
                d.d(a, i1);
                return;
            }
        }

        public void a(BusEvents.StabilityDelayChangedEvent stabilitydelaychangedevent)
        {
            int i1 = stabilitydelaychangedevent.delay;
            if (i1 < 0 || i1 > 100)
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT);
            } else
            {
                d.b(a, i1);
                return;
            }
        }

        public void a(BusEvents.SurfaceChangedEvent surfacechangedevent)
        {
            if (surfacechangedevent.hasSurface)
            {
                a.a();
                return;
            } else
            {
                a.b();
                return;
            }
        }

        public BusEvents.StabilityChangedEvent b()
        {
            return new BusEvents.StabilityChangedEvent(a.d(), (int)d.g(a));
        }

        public void c()
        {
            d.h(a).post(a());
            d.h(a).post(b());
        }

        private a()
        {
            a = d.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/kofax/kmc/kui/uicontrols/d$b, s1);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("AUTO", 0);
            b = new b("RAW", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
