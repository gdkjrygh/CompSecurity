// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            wc, App, xy

class da
    implements Runnable
{

    private static final String z[];
    final c4 a;
    final String b;
    final xy c;

    da(xy xy, String s, c4 c4_1)
    {
        c = xy;
        b = s;
        a = c4_1;
        super();
    }

    public void run()
    {
        Object obj;
        StringBuilder stringbuilder;
        Thread.sleep(300L);
        stringbuilder = (new StringBuilder()).append(z[2]).append(b).append(z[1]);
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = z[0];
_L1:
        try
        {
            Log.w(stringbuilder.append(((String) (obj))).toString());
            App.g(new wc(b, a.e(), (Vector)a.B, 12));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        obj;
        throw obj;
        obj = a.e();
          goto _L1
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "C>|(6J";
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
                obj = "\r\")'/H2(\177";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "J#305\0022. $Y4|$\"L82ieG88\177";
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
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 45;
          goto _L9
_L5:
        byte0 = 81;
          goto _L9
_L6:
        byte0 = 92;
          goto _L9
        byte0 = 69;
          goto _L9
    }
}
