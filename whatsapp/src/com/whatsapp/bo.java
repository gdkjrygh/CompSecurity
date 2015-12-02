// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.whatsapp:
//            NewGroup, fe

class bo
    implements android.view.View.OnClickListener
{

    private static final String z;
    final NewGroup a;

    bo(NewGroup newgroup)
    {
        a = newgroup;
        super();
    }

    public void onClick(View view)
    {
        ((InputMethodManager)a.getSystemService(z)).hideSoftInputFromWindow(NewGroup.d(a).getWindowToken(), 0);
        NewGroup.a(a).a(a.findViewById(0x7f0b01bf));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\f[\006sD:X\023rX\nQ".toCharArray();
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
        byte byte0 = 48;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 101;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 118;
          goto _L8
        byte0 = 6;
          goto _L8
    }
}
