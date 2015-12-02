// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cu, 
//            cp

class ab extends c
{

    private static final String z[];
    final ci a;
    final cu b;
    final Runnable c;

    ab(cu cu1, Runnable runnable, ci ci1)
    {
        b = cu1;
        c = runnable;
        a = ci1;
        super();
    }

    public void a(int i)
    {
        if (a != null)
        {
            a.a(i);
        }
    }

    public void a(c_ c_1, String s)
    {
        c_1 = c_1.a(z[0]);
        if (c_1 != null)
        {
            s = new Vector();
            cu.a(b, c_1, s, z[1], z[2]);
            if (s.size() > 0)
            {
                cu.a(b).a(s);
            }
        }
        if (c != null)
        {
            c.run();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\1773'\027Q";
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
                obj = "t$)\024D";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "z2";
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
        byte byte0 = 52;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 86;
          goto _L9
_L6:
        byte0 = 70;
          goto _L9
        byte0 = 97;
          goto _L9
    }
}
