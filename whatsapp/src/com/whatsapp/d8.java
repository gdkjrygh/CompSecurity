// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.Window;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            Voip, VoipActivity

class d8
    implements Runnable
{

    private static final String z;
    final Voip.CallState a;
    final VoipActivity b;

    d8(VoipActivity voipactivity, Voip.CallState callstate)
    {
        b = voipactivity;
        a = callstate;
        super();
    }

    public void run()
    {
        if (a == Voip.CallState.RECEIVED_CALL)
        {
            VoipActivity.a(b, Voip.getPeerJid());
        }
        if (a == Voip.CallState.NONE)
        {
            Log.i(z);
            b.finish();
        }
        if (a == Voip.CallState.ACTIVE)
        {
            b.getWindow().clearFlags(128);
        }
        VoipActivity.a(b);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "jb#Z\023Jb#Z}\177y#\\UhteI]pa\031^]hh\tB]rj/N\034oy+^Y<0w\nrSC\017\nZuc#YTuc-\n_i\1778ORh-+IHu{#^E".toCharArray();
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
        byte byte0 = 60;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 28;
          goto _L8
_L3:
        byte0 = 13;
          goto _L8
_L4:
        byte0 = 74;
          goto _L8
        byte0 = 42;
          goto _L8
    }
}
