// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            DialogToastActivity

public class About extends DialogToastActivity
{

    private static final String z;

    public About()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        bundle = (TextView)findViewById(0x7f0b0032);
        String s = getString(0x7f0e0470);
        bundle.setText((new StringBuilder()).append(s).append(" ").append(z).toString());
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "xM\036)d\177P\036".toCharArray();
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
        byte byte0 = 74;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 74;
          goto _L8
_L3:
        byte0 = 99;
          goto _L8
_L4:
        byte0 = 47;
          goto _L8
        byte0 = 24;
          goto _L8
    }
}
