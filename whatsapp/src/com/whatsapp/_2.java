// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, my, k6

final class _2
    implements Runnable
{

    private static final String z[];

    _2()
    {
    }

    public void run()
    {
        int i = App.am;
        List list = my.c;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = my.c.iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        k6 k6_1 = (k6)iterator.next();
        if (!k6_1.b()) goto _L4; else goto _L3
_L3:
        Log.i((new StringBuilder()).append(z[0]).append(k6_1.toString()).toString());
        k6_1.c();
        if (i == 0) goto _L5; else goto _L4
_L4:
        Log.i((new StringBuilder()).append(z[1]).append(k6_1.toString()).toString());
          goto _L5
_L2:
        my.c.clear();
        list;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
_L5:
        if (i == 0) goto _L6; else goto _L2
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "9\027\007hc<\027!:i8_x";
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
                obj = "9\027\007hc<\027!:o&\0239vo,E7j&,\0277jv!\013? &";
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
        byte byte0 = 6;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 72;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 26;
          goto _L9
    }
}
