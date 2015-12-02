// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            a_6, e5, App

final class kr
    implements Runnable
{

    private static final String z;
    final a_6 a;
    private final boolean b;

    kr(a_6 a_6_1, boolean flag)
    {
        a = a_6_1;
        super();
        b = flag;
    }

    public void run()
    {
        Log.i((new StringBuilder()).append(z).append(b).toString());
        e5.a(a.a).c.remove(a.b);
        if (b)
        {
            App.aG();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "k8Fz\032m#Be\030(4Jf\032j6HaVn8Y*\031f\020N~&z2`o\017F8EoL(".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 118;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 8;
          goto _L8
_L3:
        byte0 = 87;
          goto _L8
_L4:
        byte0 = 43;
          goto _L8
        byte0 = 10;
          goto _L8
    }
}
