// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            OverlayAlert

class aor
    implements android.view.View.OnClickListener
{

    private static final String z;
    final OverlayAlert a;

    aor(OverlayAlert overlayalert)
    {
        a = overlayalert;
        super();
    }

    public void onClick(View view)
    {
        Log.i(z);
        OverlayAlert.a(a);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\032\03055A\024\027\1775H\007\0137.^\001\013\"hN\031\0073,H\021".toCharArray();
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
        byte byte0 = 45;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 117;
          goto _L8
_L3:
        byte0 = 110;
          goto _L8
_L4:
        byte0 = 80;
          goto _L8
        byte0 = 71;
          goto _L8
    }
}
