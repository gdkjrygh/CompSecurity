// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, c_, cu, bb

class k extends c
{

    private static final String z[];
    final cu a;
    final byte b[];
    final byte c[];

    k(cu cu1, byte abyte0[], byte abyte1[])
    {
        a = cu1;
        b = abyte0;
        c = abyte1;
        super();
    }

    public void a(c_ c_1, String s)
    {
        c_ c_2 = c_1.a(0);
        c_.b(c_2, z[0]);
        c_1 = c_2.d(z[2]);
        s = c_2.a(z[1]).b;
        byte abyte0[] = c_2.a(z[3]).b;
        cu.d(a).a(c_1, s, abyte0, b, c);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "u(\016\030Vy";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "u5\023\r";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "`?\005\033Ky4";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "f;\004\033Uy(\023";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 34;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 22;
          goto _L9
_L5:
        byte0 = 90;
          goto _L9
_L6:
        byte0 = 119;
          goto _L9
        byte0 = 104;
          goto _L9
    }
}
