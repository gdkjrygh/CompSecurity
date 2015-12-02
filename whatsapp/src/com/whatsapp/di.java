// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            dq, RegisterName

class di extends dq
{

    private static final String z[];
    final RegisterName i;

    di(RegisterName registername, Activity activity)
    {
        i = registername;
        super(activity);
    }

    public void b()
    {
        Log.i(z[0]);
        i.removeDialog(103);
    }

    public void c()
    {
        i.b(true);
    }

    public void d()
    {
        Log.i(z[1]);
        i.showDialog(106);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int j;
        as = new String[2];
        obj = "ck@\030)ekU\037;|k\b\003?bzH\003?ugF\0355v!C\0364t";
        byte1 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[j] = ((String) (obj));
                j = 1;
                obj = "ck@\030)ekU\037;|k\b\003?bzH\003?ugF\0355v!T\0323a";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 90;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 17;
          goto _L9
_L5:
        byte0 = 14;
          goto _L9
_L6:
        byte0 = 39;
          goto _L9
        byte0 = 113;
          goto _L9
    }
}
