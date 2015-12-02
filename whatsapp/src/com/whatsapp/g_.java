// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import android.location.LocationManager;

// Referenced classes of package com.whatsapp:
//            LocationPicker2

class g_
    implements Runnable
{

    private static final String z[];
    final LocationPicker2 a;

    g_(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void run()
    {
        LocationPicker2.a(a, true);
        if (LocationPicker2.k(a) != null && LocationPicker2.a(a) == null)
        {
            int i = Math.max((int)LocationPicker2.k(a).getAccuracy(), 100);
            LocationPicker2.a(a, LocationPicker2.k(a), i, null, true);
        }
        if (LocationPicker2.k(a) == null || LocationPicker2.k(a).getAccuracy() > 200F)
        {
            LocationManager locationmanager = (LocationManager)a.getSystemService(z[2]);
            if (!locationmanager.isProviderEnabled(z[0]) || !locationmanager.isProviderEnabled(z[1]))
            {
                a.showDialog(2);
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\031T\n";
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
                obj = "\020A\r^6\fO";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\022K\032H-\027K\027";
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
        byte byte0 = 89;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 126;
          goto _L9
_L5:
        byte0 = 36;
          goto _L9
_L6:
        byte0 = 121;
          goto _L9
        byte0 = 41;
          goto _L9
    }
}
