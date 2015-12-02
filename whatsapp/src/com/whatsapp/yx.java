// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            h5, App, aoz

class yx
    implements Runnable
{

    private static final String z[];
    final h5 a;

    yx(h5 h5_1)
    {
        a = h5_1;
        super();
    }

    public void run()
    {
        App.a(a.c);
        c4 c4_1 = App.ah.a(a.b);
        if (c4_1 != null)
        {
            Log.i((new StringBuilder()).append(z[0]).append(a.b).append(z[1]).toString());
            c4_1.b(null);
            App.p(c4_1);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\001zS\f\003\024n\034\022\t\023gR\004\005\016e\034";
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
                obj = "@fI\005L\024m\034\023\t\022tY\022L\020n]\t\002\024gD\024L\022g_\005\005\020v";
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
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 108;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 96;
          goto _L9
_L5:
        byte0 = 2;
          goto _L9
_L6:
        byte0 = 60;
          goto _L9
        byte0 = 96;
          goto _L9
    }
}
