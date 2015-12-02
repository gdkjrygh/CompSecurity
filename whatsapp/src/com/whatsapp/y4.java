// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            vj, hl

class y4
    implements Runnable
{

    private static final String z;
    final vj a;

    y4(vj vj1)
    {
        a = vj1;
        super();
    }

    public void run()
    {
        Log.i(z);
        vj.a(a).runOnUiThread(new hl(this));
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "@\004\nf_O\f\013hJB\016\nj\026F\023\035\177XD\004\034m\026U\000\026aVBL\013{XD\025Uk[\033\023\035|MY\023\035\"T_\022\013fWQL\023".toCharArray();
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
        byte byte0 = 57;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 54;
          goto _L8
_L3:
        byte0 = 97;
          goto _L8
_L4:
        byte0 = 120;
          goto _L8
        byte0 = 15;
          goto _L8
    }
}
