// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import com.google.android.gms.maps.model.Marker;
import com.whatsapp.fieldstats.ak;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, LocationPicker2, t3, PlaceInfo

class ady
    implements com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
{

    private static final String z;
    final LocationPicker2 a;

    ady(LocationPicker2 locationpicker2)
    {
        a = locationpicker2;
        super();
    }

    public void onInfoWindowClick(Marker marker)
    {
        int i = App.am;
        if (marker.getId() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
label1:
            {
                Iterator iterator = LocationPicker2.a(a).iterator();
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (PlaceInfo)iterator.next();
                } while (!marker.equals(((PlaceInfo) (obj)).tag));
                for (marker = ((Marker) (obj)); marker == null; marker = null)
                {
                    continue; /* Loop/switch isn't completed */
                }

                if (LocationPicker2.p(a) != null)
                {
                    App.a(a, LocationPicker2.p(a), marker);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                obj = new Intent();
                ((Intent) (obj)).putExtra(z, marker);
                a.setResult(-1, ((Intent) (obj)));
            }
            LocationPicker2.a(a, ak.PLACE);
            a.finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\002>NA4".toCharArray();
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
        byte byte0 = 81;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 114;
          goto _L8
_L3:
        byte0 = 82;
          goto _L8
_L4:
        byte0 = 47;
          goto _L8
        byte0 = 34;
          goto _L8
    }
}
