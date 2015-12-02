// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            Voip, VoipActivity, App, VoiceService

class afh
    implements android.view.View.OnClickListener
{

    private static final String z[];
    final VoipActivity a;

    afh(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (Voip.getCurrentCallState() == Voip.CallState.RECEIVED_CALL)
            {
                VoipActivity.c(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            view = new Intent(z[1], null, a, com/whatsapp/VoiceService);
            view.putExtra(z[0], VoipActivity.g(a));
            a.startService(view);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "xn\003";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "as\006\0355Md\006\003-";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 65;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 18;
          goto _L9
_L5:
        byte0 = 7;
          goto _L9
_L6:
        byte0 = 103;
          goto _L9
        byte0 = 111;
          goto _L9
    }
}
