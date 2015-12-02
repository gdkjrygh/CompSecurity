// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App, aoz, tn

class ab2
    implements Runnable
{

    private static final String z;
    final String a;
    final cf b;
    final tn c;
    final String d;

    ab2(tn tn, cf cf1, String s, String s1)
    {
        c = tn;
        b = cf1;
        a = s;
        d = s1;
        super();
    }

    public void run()
    {
        Object obj;
        int i;
label0:
        {
            i = App.am;
            if (b.k != null)
            {
                obj = new a(b.f, b.l, b.k);
                obj = App.ah.a(((a) (obj)), b.j);
                if (i == 0)
                {
                    break label0;
                }
            }
            c4 c4_1 = App.ah.t(b.f);
            if (c4_1 != null)
            {
                obj = c4_1.y;
                obj = App.ah.a(((a) (obj)), b.j);
                ((List) (obj)).add(c4_1);
                if (i == 0)
                {
                    break label0;
                }
            }
            obj = new ArrayList();
        }
label1:
        {
            if (obj != null)
            {
                com.whatsapp.App.a(a, ((List) (obj)));
                if (i == 0)
                {
                    break label1;
                }
            }
            App.d(a, 404);
        }
        App.d(a, d, z);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "C<\n".toCharArray();
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
        byte byte0 = 18;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 52;
          goto _L8
_L3:
        byte0 = 89;
          goto _L8
_L4:
        byte0 = 104;
          goto _L8
        byte0 = 60;
          goto _L8
    }
}
