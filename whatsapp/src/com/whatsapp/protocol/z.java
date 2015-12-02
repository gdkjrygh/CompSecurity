// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cj, 
//            cu

class z extends c
{

    private static final String z[];
    final boolean a;
    final cj b;
    final cu c;
    final ci d;

    z(cu cu, cj cj1, boolean flag, ci ci1)
    {
        c = cu;
        b = cj1;
        a = flag;
        d = ci1;
        super();
    }

    public void a(int i)
    {
        if (d != null)
        {
            d.a(i);
        }
    }

    public void a(c_ c_1, String s)
    {
        if (b != null)
        {
            s = null;
            if (!a)
            {
                c_1 = c_1.a(0);
                c_.b(c_1, z[0]);
                s = c_1.d(z[1]);
            }
            b.a(s);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ";\036\016@F9\022";
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
                obj = "\"\023";
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
        byte byte0 = 51;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 119;
          goto _L9
_L6:
        byte0 = 109;
          goto _L9
        byte0 = 52;
          goto _L9
    }
}
