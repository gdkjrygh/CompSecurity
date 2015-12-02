// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.fieldstats.ak;
import java.io.Serializable;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, t3, PlaceInfo, App

class cn
    implements android.widget.AdapterView.OnItemClickListener
{

    private static final String z;
    final LocationPicker2 a;

    cn(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            if (LocationPicker2.a(a) == null || i >= LocationPicker2.a(a).size())
            {
                return;
            }
            if (LocationPicker2.p(a) != null)
            {
                App.a(a, LocationPicker2.p(a), (PlaceInfo)LocationPicker2.a(a).get(i));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            adapterview = new Intent();
            adapterview.putExtra(z, (Serializable)LocationPicker2.a(a).get(i));
            a.setResult(-1, adapterview);
        }
        LocationPicker2.a(a, ak.PLACE, i);
        a.finish();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "_\024OK#".toCharArray();
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
        byte byte0 = 70;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 47;
          goto _L8
_L3:
        byte0 = 120;
          goto _L8
_L4:
        byte0 = 46;
          goto _L8
        byte0 = 40;
          goto _L8
    }
}
