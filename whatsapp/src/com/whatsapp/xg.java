// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.whatsapp:
//            WebImagePicker

class xg
    implements Runnable
{

    private static final String z;
    final WebImagePicker a;

    xg(WebImagePicker webimagepicker)
    {
        a = webimagepicker;
        super();
    }

    public void run()
    {
        ((InputMethodManager)a.getSystemService(z)).showSoftInput(WebImagePicker.k(a), 1);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\t[\0300\177?X\r1c\017Q".toCharArray();
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
        byte byte0 = 11;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 96;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 104;
          goto _L8
        byte0 = 69;
          goto _L8
    }
}
