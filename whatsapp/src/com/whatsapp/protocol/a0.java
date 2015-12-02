// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, c8, c_

class a0 extends c
{

    private static final String z[];
    final String a;
    final String b;
    final cu c;
    final String d;
    final String e;

    a0(cu cu1, String s, String s1, String s2, String s3)
    {
        c = cu1;
        d = s;
        b = s1;
        a = s2;
        e = s3;
        super();
    }

    public void a(int i)
    {
        c.b.c(d, i);
    }

    public void a(c_ c_1, String s)
    {
        boolean flag;
        s = null;
        flag = true;
        if (c_1 == null) goto _L2; else goto _L1
_L1:
        c_ c_2 = c_1.a(z[3]);
        if (c_2 == null) goto _L2; else goto _L3
_L3:
        c_ c_3 = c_2.a(z[2]);
        if (c_3 != null)
        {
            c_1 = c_3.d(z[4]);
            s = c_3.d(z[0]);
        } else
        {
            c_1 = null;
        }
        if (c_2.a(z[1]) == null)
        {
            flag = false;
        }
_L5:
        c.b.a(d, b, a, e, c_1, s, flag);
        return;
_L2:
        flag = false;
        s = null;
        c_1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "~\016x_\013y\016";
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
                obj = "h\025zM\027i\b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "l\020v\\\036s\016z";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "o\005yK";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "s\017";
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
        byte byte1 = 120;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 28;
          goto _L9
_L5:
        byte1 = 124;
          goto _L9
_L6:
        byte1 = 23;
          goto _L9
        byte1 = 40;
          goto _L9
    }
}
