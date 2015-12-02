// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c4, c_, 
//            cr, cu, bx

class ai extends c
{

    private static final String z[];
    final ci a;
    final cu b;
    final ci c;

    ai(cu cu1, ci ci1, ci ci2)
    {
        b = cu1;
        a = ci1;
        c = ci2;
        super();
    }

    public void a(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
    }

    public void a(c_ c_1, String s)
    {
        boolean flag;
        int j;
        flag = false;
        j = c4.F;
        if (a == null) goto _L2; else goto _L1
_L1:
        int i;
        c_1 = c_1.a(0);
        i = ((flag) ? 1 : 0);
        if (c_1 == null) goto _L4; else goto _L3
_L3:
        Object obj = c_1.a(0);
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((c_) (obj)).b(z[2]);
        if (obj == null) goto _L6; else goto _L7
_L7:
        cr acr[];
        acr = new cr[((Vector) (obj)).size()];
        i = 0;
_L12:
        if (i >= ((Vector) (obj)).size()) goto _L9; else goto _L8
_L8:
        c_ c_2;
label0:
        {
            c_2 = (c_)((Vector) (obj)).elementAt(i);
            c_ c_3 = c_2.a(0);
            if (c_3 != null)
            {
                acr[i] = cu.b(b, c_3);
                if (j == 0)
                {
                    break label0;
                }
            }
            acr[i] = new cr();
        }
        acr[i].g = c_2.d(z[1]);
        if (j == 0) goto _L10; else goto _L9
_L9:
        cu.b(b).a(s, acr);
_L6:
        c_1 = c_1.d(z[0]);
        i = ((flag) ? 1 : 0);
        if (c_1 != null)
        {
            i = Integer.parseInt(c_1);
        }
_L4:
        a.a(i * 1000);
_L2:
        return;
_L10:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "LO^\037\017AUB";
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
                obj = "BSH";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "X[^\n\022KS\\\037\025\\";
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
        byte byte0 = 123;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 40;
          goto _L9
_L5:
        byte0 = 58;
          goto _L9
_L6:
        byte0 = 44;
          goto _L9
        byte0 = 126;
          goto _L9
    }
}
