// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, atr, zc

final class rg
    implements Runnable
{

    private static final String z[];
    final String a;
    final Context b;

    rg(String s, Context context)
    {
        a = s;
        b = context;
        super();
    }

    public void run()
    {
        Object obj;
        int i;
        i = App.am;
        obj = atr.b();
        if (((String) (obj)).length() <= 0) goto _L2; else goto _L1
_L1:
        zc zc1 = zc.a(a);
        if (zc1 != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if ((obj = zc.a(((String) (obj)))) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        b.getSharedPreferences(z[1], 0).edit().putLong(z[2], System.currentTimeMillis()).commit();
        zc1.a(((zc) (obj)));
        JVM INSTR tableswitch -1 1: default 104
    //                   -1 117
    //                   0 124
    //                   1 124;
           goto _L5 _L6 _L7 _L7
_L5:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        Log.e(z[0]);
        return;
_L6:
        atr.a();
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        atr.g();
        if (true) goto _L5; else goto _L8
_L8:
        if (true) goto _L3; else goto _L9
_L9:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "2'rY\t\"igTE5,gI\f\"?v\033\027\"$|O\000g?vI\026.&}";
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
                obj = "$&~\025\022/(gH\00479LK\027\"/vI\000)*vH";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "+(`O:29tI\004#,LX\r\"*x";
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
        byte byte0 = 101;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 71;
          goto _L9
_L5:
        byte0 = 73;
          goto _L9
_L6:
        byte0 = 19;
          goto _L9
        byte0 = 59;
          goto _L9
    }
}
