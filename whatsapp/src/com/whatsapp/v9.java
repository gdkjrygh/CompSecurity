// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.location.Location;
import android.view.View;
import com.whatsapp.fieldstats.ak;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, App

class v9
    implements android.view.View.OnClickListener
{

    private static final String z;
    final LocationPicker2 a;

    v9(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (LocationPicker2.k(a) != null && LocationPicker2.k(a).getAccuracy() > 200F)
            {
                LocationPicker2.a(a, null);
            }
            if (LocationPicker2.p(a) != null)
            {
                App.a(a, LocationPicker2.p(a), LocationPicker2.k(a));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view = new Intent();
            view.putExtra(z, LocationPicker2.k(a));
            a.setResult(-1, view);
        }
        LocationPicker2.a(a, ak.CURRENT_LOCATION);
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "oar\0214ja\177".toCharArray();
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
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 64;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 3;
          goto _L8
_L3:
        byte0 = 14;
          goto _L8
_L4:
        byte0 = 17;
          goto _L8
        byte0 = 112;
          goto _L8
    }
}
