// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.io.Serializable;

// Referenced classes of package com.whatsapp:
//            LocationPicker, t3, PlaceInfo, App

class f2
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String z;
    final LocationPicker a;

    f2(LocationPicker locationpicker)
    {
        a = locationpicker;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            if (LocationPicker.n(a) == null || i >= LocationPicker.n(a).size())
            {
                return;
            }
            if (LocationPicker.a(a) != null)
            {
                App.a(a, LocationPicker.a(a), (PlaceInfo)LocationPicker.n(a).get(i));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            adapterview = new Intent();
            adapterview.putExtra(z, (Serializable)LocationPicker.n(a).get(i));
            a.setResult(-1, adapterview);
        }
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\000\nf6X".toCharArray();
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
        byte byte0 = 61;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 112;
          goto _L8
_L3:
        byte0 = 102;
          goto _L8
_L4:
        byte0 = 7;
          goto _L8
        byte0 = 85;
          goto _L8
    }
}
