// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cj, 
//            cu

class g extends c
{

    private static final String z[];
    final cj a;
    final cu b;
    final ci c;

    g(cu cu, cj cj1, ci ci1)
    {
        b = cu;
        a = cj1;
        c = ci1;
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
        c_1 = c_1.a(0);
        c_.b(c_1, z[1]);
        c_1 = c_1.d(z[0]);
        if (a != null)
        {
            a.a(c_1);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\trUwP\017";
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
                i = 1;
                obj = "\025xTo]\027~\\g";
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
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 60;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 123;
          goto _L9
_L5:
        byte0 = 23;
          goto _L9
_L6:
        byte0 = 38;
          goto _L9
        byte0 = 2;
          goto _L9
    }
}
