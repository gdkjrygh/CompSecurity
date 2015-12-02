// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            es, CallsFragment

class c4
    implements es
{

    private static final String z[];
    final CallsFragment a;

    c4(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    public void a(com.whatsapp.protocol.c4 c4_1)
    {
        Log.i(z[1]);
        CallsFragment.a(a);
    }

    public void a(String s, long l)
    {
    }

    public void b(com.whatsapp.protocol.c4 c4_1)
    {
        Log.i(z[0]);
        CallsFragment.a(a);
    }

    public void c(com.whatsapp.protocol.c4 c4_1)
    {
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "aL1SP-B3|BnA\020VPqH9";
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
                obj = "aL1SP-B3|BnA\030QGgI";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 162
    //                   2 168
    //                   3 174;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_174;
_L3:
        byte byte0 = 35;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 2;
          goto _L9
_L5:
        byte0 = 45;
          goto _L9
_L6:
        byte0 = 93;
          goto _L9
        byte0 = 63;
          goto _L9
    }
}
