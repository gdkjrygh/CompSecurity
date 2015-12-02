// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.location.Location;
import android.view.View;
import com.google.android.maps.MyLocationOverlay;

// Referenced classes of package com.whatsapp:
//            LocationPicker, App

class a8d
    implements android.view.View.OnClickListener
{

    private static final String z;
    final LocationPicker a;

    a8d(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            Object obj = LocationPicker.h(a).getLastFix();
            view = ((View) (obj));
            if (obj != null)
            {
                view = ((View) (obj));
                if (((Location) (obj)).getAccuracy() > 200F)
                {
                    view = null;
                }
            }
            if (LocationPicker.a(a) != null)
            {
                App.a(a, LocationPicker.a(a), view);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            obj = new Intent();
            ((Intent) (obj)).putExtra(z, view);
            a.setResult(-1, ((Intent) (obj)));
        }
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "XJ&\023\\]J+".toCharArray();
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
        byte byte0 = 40;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 52;
          goto _L8
_L3:
        byte0 = 37;
          goto _L8
_L4:
        byte0 = 69;
          goto _L8
        byte0 = 114;
          goto _L8
    }
}
