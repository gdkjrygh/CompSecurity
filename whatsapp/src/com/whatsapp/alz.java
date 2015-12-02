// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, GroupChatInfo

class alz
    implements android.os.Handler.Callback
{

    private static final String z[];
    final GroupChatInfo a;

    alz(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public boolean handleMessage(Message message)
    {
label0:
        {
            Bundle bundle = (Bundle)message.obj;
            if (message.what == 0)
            {
                Log.a(z[1], null, new Object[] {
                    bundle.getString(z[2]), Integer.valueOf(message.arg1)
                });
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.f(bundle.getString(z[0]));
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "WS@boW";
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
                obj = "CUNcj{DIwn{NOpu\013@DbEWS@boWxGwsHBE6pMC\0343i\004DNr\177\031\002E";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "NNE";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 26;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 36;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 33;
          goto _L9
        byte0 = 22;
          goto _L9
    }
}
