// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import android.location.LocationManager;

// Referenced classes of package com.whatsapp:
//            LocationPicker

class atm
    implements Runnable
{

    private static final String z[];
    final LocationPicker a;

    atm(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public void run()
    {
        LocationPicker.a(a, true);
        if (LocationPicker.p(a) != null && LocationPicker.n(a) == null)
        {
            int i = Math.max((int)LocationPicker.p(a).getAccuracy(), 100);
            LocationPicker.a(a, LocationPicker.p(a), i, null, true);
        }
        if (LocationPicker.p(a) == null || LocationPicker.p(a).getAccuracy() > 200F)
        {
            LocationManager locationmanager = (LocationManager)a.getSystemService(z[1]);
            if (!locationmanager.isProviderEnabled(z[0]) || !locationmanager.isProviderEnabled(z[2]))
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
        obj = ",:k";
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
                obj = "'%{G!\"%v";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "%/lQ:9!";
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
        byte byte0 = 85;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 74;
          goto _L9
_L6:
        byte0 = 24;
          goto _L9
        byte0 = 38;
          goto _L9
    }
}
