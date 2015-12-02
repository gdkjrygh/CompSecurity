// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cu, 
//            cp

class a9 extends c
{

    private static final String z[];
    final Runnable a;
    final ci b;
    final cu c;

    a9(cu cu1, Runnable runnable, ci ci1)
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
        if (c_1.a(z[1]) != null)
        {
            s = new Vector();
            Hashtable hashtable = new Hashtable();
            cu.a(c, c_1, s, hashtable, z[0]);
            cu.a(c).a(s, hashtable);
        }
        if (a != null)
        {
            a.run();
        }
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "z|\036RE{".toCharArray();
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
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 49;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 30;
          goto _L9
_L5:
        byte0 = 25;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 55;
          goto _L9
    }
}
