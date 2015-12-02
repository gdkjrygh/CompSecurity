// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            ov, aoz, zi

class mp
    implements Runnable
{

    private static final String z;
    final Runnable a;
    final Runnable b;
    final aoz c;

    mp(aoz aoz1, Runnable runnable, Runnable runnable1)
    {
        c = aoz1;
        a = runnable;
        b = runnable1;
        super();
    }

    public void run()
    {
        Iterator iterator;
        boolean flag;
        flag = ov.e;
        iterator = aoz.i(c).values().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        zi zi1 = (zi)iterator.next();
        if (zi1.b < 500)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w((new StringBuilder()).append(z).append(zi1.b).toString());
        if (a != null)
        {
            a.run();
        }
_L4:
        return;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (b == null) goto _L4; else goto _L3
_L3:
        b.run();
        return;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "*f<C<(g>\037:\"v>Y>\"qtB-$p2F-#:>B:(g{".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 72;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 71;
          goto _L8
_L3:
        byte0 = 21;
          goto _L8
_L4:
        byte0 = 91;
          goto _L8
        byte0 = 48;
          goto _L8
    }
}
