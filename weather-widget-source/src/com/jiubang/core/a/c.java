// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.hardware.SensorEvent;
import android.view.Display;
import android.view.WindowManager;

public class c
{

    private float a[];
    private float b;
    private float c;

    public c()
    {
        b = 2.5F;
        c = 0.5F;
        a = new float[3];
    }

    public final float[] a(Context context, SensorEvent sensorevent)
    {
        if (sensorevent == null || sensorevent.values.length < 3 || sensorevent.values[0] == 0.0F || sensorevent.values[1] == 0.0F || sensorevent.values[2] == 0.0F)
        {
            return null;
        }
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 1 3: default 92
    //                   1 287
    //                   2 327
    //                   3 366;
           goto _L1 _L2 _L3 _L4
_L1:
        a[0] = sensorevent.values[0];
        a[1] = -sensorevent.values[1];
        a[2] = -sensorevent.values[2];
_L6:
        context = a;
        context[1] = context[1] / 60F;
        context = a;
        context[2] = context[2] / 60F;
        context = a;
        context[1] = context[1] - c;
        context = a;
        context[1] = context[1] * b;
        context = a;
        context[2] = context[2] * b;
        if (a[1] > 1.0F)
        {
            a[1] = 1.0F;
        }
        if (a[1] < -1F)
        {
            a[1] = -1F;
        }
        if (a[2] > 1.0F)
        {
            a[2] = 1.0F;
        }
        if (a[2] < -1F)
        {
            a[2] = -1F;
        }
        return a;
_L2:
        a[0] = sensorevent.values[0];
        a[1] = sensorevent.values[2];
        a[2] = -sensorevent.values[1];
        continue; /* Loop/switch isn't completed */
_L3:
        a[0] = sensorevent.values[0];
        a[1] = sensorevent.values[1];
        a[2] = sensorevent.values[2];
        continue; /* Loop/switch isn't completed */
_L4:
        a[0] = sensorevent.values[0];
        a[1] = -sensorevent.values[2];
        a[2] = sensorevent.values[1];
        if (true) goto _L6; else goto _L5
_L5:
    }
}
