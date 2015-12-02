// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, c_, cu, bb, 
//            c4

class j extends c
{

    private static final String z[];
    final byte a[];
    final cu b;

    j(cu cu1, byte abyte0[])
    {
        b = cu1;
        a = abyte0;
        super();
    }

    public void a(c_ c_1, String s)
    {
label0:
        {
            c_1 = c_1.a(0);
            c_.b(c_1, z[0]);
            c_1 = c_1.a(z[1]);
            if (c_1 != null)
            {
                c_1 = cu.a(b, c_1);
                cu.d(b).a(a, c_1);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            cu.d(b).a(a, null);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ")|#s\f6";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = ":z$y\0345m";
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
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 105;
_L9:
        obj[k] = (char)(byte0 ^ c1);
        k++;
          goto _L8
_L4:
        byte0 = 91;
          goto _L9
_L5:
        byte0 = 25;
          goto _L9
_L6:
        byte0 = 71;
          goto _L9
        byte0 = 22;
          goto _L9
    }
}
