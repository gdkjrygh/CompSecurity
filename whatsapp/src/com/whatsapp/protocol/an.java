// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_, b0

class an extends c
{

    private static final String z[];
    final cu a;
    final String b[];

    an(cu cu1, String as[])
    {
        a = cu1;
        b = as;
        super();
    }

    public void a(int i)
    {
        cu.d(a).e(i);
    }

    public void a(c_ c_1, String s)
    {
        int l;
        l = c4.F;
        s = new Hashtable(b.length);
        int i = 0;
        do
        {
            if (i >= b.length)
            {
                break;
            }
            s.put(b[i], new Vector());
            i++;
        } while (l == 0);
        c_1 = c_1.a(0);
        if (c_1 == null || c_1.a == null || c_1.a.length <= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L6:
        if (j >= c_1.a.length) goto _L2; else goto _L3
_L3:
        c_ c_2 = c_1.a[j];
        c_.b(c_2, z[1]);
        Object obj = c_2.e(z[2]);
        if (s.containsKey(obj))
        {
            obj = (Vector)s.get(obj);
            int k = 0;
            do
            {
                if (k >= c_2.a.length)
                {
                    break;
                }
                ((Vector) (obj)).addElement(new b0(c_2.a[k].d, c_2.a[k].e(z[0])));
                k++;
            } while (l == 0);
        }
        if (l == 0) goto _L4; else goto _L2
_L2:
        cu.d(a).d(s);
        return;
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(Exception exception)
    {
        cu.d(a).a(exception);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "Sr\177H\027";
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
                obj = "P`vO";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "Ozw";
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
        byte byte0 = 114;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 37;
          goto _L9
_L5:
        byte0 = 19;
          goto _L9
_L6:
        byte0 = 19;
          goto _L9
        byte0 = 61;
          goto _L9
    }
}
