// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cu, 
//            ct, bb

class h extends c
{

    private static final String z;
    final Runnable a;
    final ci b;
    final cu c;

    h(cu cu1, Runnable runnable, ci ci1)
    {
        c = cu1;
        a = runnable;
        b = ci1;
        super();
    }

    public void a(int i)
    {
        if (b != null)
        {
            b.a(i);
        }
    }

    public void a(c_ c_1, String s)
    {
        c_1 = c_1.a(0);
        c_.b(c_1, z);
        if (a != null)
        {
            a.run();
        }
        c_1 = c_1.a(0);
        if (c_1 != null)
        {
            c_1 = cu.a(c, c_1);
            if (c_1 != null)
            {
                cu.d(c).a(((ct) (c_1)).b, ((ct) (c_1)).a);
            }
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "r.,\026\007f".toCharArray();
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
        byte byte0 = 97;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 31;
          goto _L8
_L3:
        byte0 = 65;
          goto _L8
_L4:
        byte0 = 72;
          goto _L8
        byte0 = 127;
          goto _L8
    }
}
