// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

// Referenced classes of package com.whatsapp.util:
//            bd, a6

public final class aq
{

    private static final String z;
    private final SensorManager a;
    private SensorEventListener b;
    private final Sensor c;

    public aq(Context context)
    {
        a = (SensorManager)context.getSystemService(z);
        c = a.getDefaultSensor(8);
    }

    static Sensor a(aq aq1)
    {
        return aq1.c;
    }

    public void a(a6 a6)
    {
        if (b != null)
        {
            a.unregisterListener(b, c);
            b = null;
        }
        if (a6 != null)
        {
            b = new bd(this, a6);
            a.registerListener(b, c, 2);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\nbm)p\013".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 31;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 121;
          goto _L8
_L3:
        byte0 = 7;
          goto _L8
_L4:
        byte0 = 3;
          goto _L8
        byte0 = 90;
          goto _L8
    }
}
