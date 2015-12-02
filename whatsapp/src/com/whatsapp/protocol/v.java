// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, c4, c_, cu, 
//            bb

class v extends c
{

    private static final String z[];
    final cu a;

    v(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(int i)
    {
    }

    public void a(c_ c_1, String s)
    {
        int j = c4.F;
        c_ c_2 = c_1.a(0);
        Hashtable hashtable = new Hashtable();
        c_.b(c_2, z[0]);
        if (c_2.a != null)
        {
            int i = 0;
            do
            {
                if (i >= c_2.a.length)
                {
                    break;
                }
                c_ c_3 = c_2.a[i];
                c_.b(c_3, z[1]);
                String s1 = c_3.d(z[2]);
                s = c_3.d(z[4]);
                c_1 = s;
                if (z[3].equals(s))
                {
                    c_1 = c_3.a(0);
                    c_.b(c_1, z[6]);
                    c_1 = c_1.d(z[5]);
                }
                hashtable.put(s1, c_1);
                i++;
            } while (j == 0);
        }
        cu.d(a).b(hashtable);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "`zG+;sq";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "siZ8=\177zW";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "~iC8";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "uz\\2(";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "fiB(?";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "sgJ8";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "uz\\2(";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 90;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 8;
          goto _L9
_L6:
        byte1 = 46;
          goto _L9
        byte1 = 93;
          goto _L9
    }
}
