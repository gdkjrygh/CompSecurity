// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c_

class l extends c
{

    private static final String z[];
    final byte a[];
    final String b;
    final cu c;
    final Runnable d;
    final byte e[];

    l(cu cu1, String s, byte abyte0[], byte abyte1[], Runnable runnable)
    {
        c = cu1;
        b = s;
        e = abyte0;
        a = abyte1;
        d = runnable;
        super();
    }

    public void a(int i)
    {
        cu.d(c).a(i, null, b, e, a, d);
    }

    public void a(c_ c_1, String s)
    {
        c_1 = c_1.a(0);
        c_.b(c_1, z[0]);
        c_1 = c_1.a(z[1]).b;
        cu.d(c).a(0, c_1, b, e, a, d);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "nu9.\rb";
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
                obj = "}f3-\016bu$";
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
        byte byte0 = 121;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 13;
          goto _L9
_L5:
        byte0 = 7;
          goto _L9
_L6:
        byte0 = 64;
          goto _L9
        byte0 = 94;
          goto _L9
    }
}
