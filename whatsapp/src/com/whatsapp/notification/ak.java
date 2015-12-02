// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class ak
    implements Runnable
{

    private static final String z[];
    final PopupNotification a;

    ak(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void run()
    {
label0:
        {
            if (PopupNotification.p(a) != null)
            {
                PopupNotification.l(a).unregisterListener(PopupNotification.p(a));
            }
            PopupNotification.a(a, null);
            if (PopupNotification.g(a) != null)
            {
                Log.i((new StringBuilder()).append(z[1]).append(PopupNotification.o(a)).append(z[0]).append(PopupNotification.g(a).getMaximumRange()).toString());
                if (PopupNotification.o(a) < 5F && PopupNotification.o(a) != PopupNotification.g(a).getMaximumRange())
                {
                    break label0;
                }
                PopupNotification.c(a);
                if (!PopupNotification.q)
                {
                    break label0;
                }
            }
            Log.i(z[2]);
            PopupNotification.c(a);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "k\027.0Y";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = ";\025?=\023%\025;!\005\"\031.<\n$\024`8\021$\002&%\n?\003u";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = ";\025?=\023%\025;!\005\"\031.<\n$\024`&\fk\n='\033\"\027&<\032k\t*&\020$\b";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 99;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 79;
          goto _L9
        byte0 = 72;
          goto _L9
    }
}
