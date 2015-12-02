// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, c4, c_, cu, 
//            bb

class al extends c
{

    private static final String z[];
    final cu a;

    al(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(c_ c_1, String s)
    {
        int j = 0;
        int k = c4.F;
        c_1 = c_1.a(z[0]);
        if (c_1 != null)
        {
            s = c_1.d(z[4]);
            int i;
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                i = 0;
            }
            c_1 = c_1.b(z[2]);
            s = new Hashtable();
            do
            {
                if (j >= c_1.size())
                {
                    break;
                }
                c_ c_2 = (c_)c_1.elementAt(j);
                s.put(c_2.d(z[1]), c_2.d(z[3]));
                j++;
            } while (k == 0);
            cu.d(a).a(i, s);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "Yac>\f";
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
                obj = "Gra+";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Yac>";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "_r`;\032";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "_v~=\026F}";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 127;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 41;
          goto _L9
_L5:
        byte1 = 19;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 78;
          goto _L9
    }
}
