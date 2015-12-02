// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bn, c4, 
//            c_

class ah extends c
{

    private static final String z[];
    final cu a;

    ah(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(int i)
    {
label0:
        {
            if (i == 404)
            {
                cu.c(a).b();
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            if (i == 503)
            {
                cu.c(a).a();
            }
        }
    }

    public void a(c_ c_1, String s)
    {
        int k = c4.F;
        c_ c_4 = c_.a(c_1.a(z[7]));
        c_1 = c_.a(c_4.a(z[5]));
        s = c_.a(c_4.a(z[0]));
        c_ c_2 = c_.a(c_.a(c_4.a(z[4])).a(z[2]));
        c_ c_3 = c_.a(c_4.a(z[6]));
        c_4 = c_.a(c_4.a(z[3]));
        byte abyte0[][];
        int i;
        int j;
        if (c_3.a != null)
        {
            i = c_3.a.length;
        } else
        {
            i = 0;
        }
        abyte0 = new byte[i][];
        j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            c_.b(c_3.a[j], z[1]);
            abyte0[j] = c_.a(c_3.a[j], 3);
            j++;
        } while (k == 0);
        cu.c(a).a(c_.a(c_1, 4), c_.a(s, 1)[0], c_.a(c_2, 3), abyte0, c_.a(c_4, 20));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "OE\013(";
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
                obj = "RX";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "RX";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "S]\b%";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "HW\0364";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "IY\034$LON\0329VTR";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "WU\b9";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "_U\034(LO";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 63;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 59;
          goto _L9
_L5:
        byte1 = 60;
          goto _L9
_L6:
        byte1 = 123;
          goto _L9
        byte1 = 77;
          goto _L9
    }
}
