// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class a
    implements SensorEventListener
{

    private static final String z;
    final PopupNotification a;

    a(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        PopupNotification.a(a, sensorevent.values[0]);
        Log.i((new StringBuilder()).append(z).append(PopupNotification.o(a)).toString());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "X\022+\035\033F\022/\001\rA\036:\034\002G\023t\030\031G\0052\005\002\\\004a".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 107;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 40;
          goto _L8
_L3:
        byte0 = 125;
          goto _L8
_L4:
        byte0 = 91;
          goto _L8
        byte0 = 104;
          goto _L8
    }
}
