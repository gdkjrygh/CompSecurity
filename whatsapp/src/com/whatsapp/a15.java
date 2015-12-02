// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bd;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import org.whispersystems.aa;

// Referenced classes of package com.whatsapp:
//            tt, ey, a3, App

final class a15
    implements Runnable
{

    private static final String z[];
    private final bd a;
    private final int b;
    final a3 c;
    private final bd d[];
    private final boolean e;
    private final byte f[];

    a15(a3 a3_1, tt tt1)
    {
        c = a3_1;
        super();
        e = tt1.b();
        b = tt1.b();
        f = tt1.g();
        d = tt1.a();
        a = tt1.f().b();
    }

    public void run()
    {
        if (c.e.c())
        {
            Log.i((new StringBuilder()).append(z[2]).append(c.e.y).toString());
            byte abyte0[] = aa.a(b);
            if (e)
            {
                Log.i((new StringBuilder()).append(z[3]).append(b).toString());
                App.a(f, abyte0, (byte)5, d, a);
            }
            Log.i((new StringBuilder()).append(z[1]).append(c.e.y).append(z[0]).append(b).toString());
            App.a(c.e, c.e.D + 1, abyte0);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "BP@-vBUL>w\021S[8j\013HGyw\006\007";
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
                obj = "\003_F5q\026K\t*{\fC@7yBUL-l\033\007[<}\007NY->\004H[y";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\003_F5q\026K\t7{\007CZyj\r\007Z<p\006\007[<j\020^\t+{\001B@)jBAF+>";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\003_F5q\026K\t*{\fC@7yBKF:\177\016\007Y+{BLL mBSFym\007U_<lBAF+>\020BN0m\026UH-w\rI\t0zB";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 30;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 98;
          goto _L9
_L5:
        byte0 = 39;
          goto _L9
_L6:
        byte0 = 41;
          goto _L9
        byte0 = 89;
          goto _L9
    }
}
