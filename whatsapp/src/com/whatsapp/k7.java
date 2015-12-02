// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c5;

// Referenced classes of package com.whatsapp:
//            k6, App

public class k7 extends k6
{

    private static final String z[];
    c5 b;

    public k7(c5 c5_1)
    {
        b = c5_1;
    }

    public String a()
    {
        return (new StringBuilder()).append(z[1]).append(b.b).append(z[0]).append(b.a).append(z[2]).append(b.d).toString();
    }

    public void c()
    {
        App.a(b.a, b.b, b.d);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "f4\004H\177";
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
                obj = "7)+\0217'/+\007/\":\000\027\177";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "f/\007H\177";
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
        char c1 = obj[j];
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
        byte byte0 = 95;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 70;
          goto _L9
_L5:
        byte0 = 91;
          goto _L9
_L6:
        byte0 = 116;
          goto _L9
        byte0 = 114;
          goto _L9
    }
}
