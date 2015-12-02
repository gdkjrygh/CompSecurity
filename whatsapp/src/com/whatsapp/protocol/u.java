// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_

class u extends c
{

    private static final String z[];
    final cu a;

    u(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(int i)
    {
        if (i == 404)
        {
            cu.d(a).e();
        }
    }

    public void a(c_ c_1, String s)
    {
        int j = c4.F;
        c_1 = c_1.a(0);
        c_.b(c_1, z[1]);
        c_1 = c_1.a(0);
        c_.b(c_1, z[4]);
        cu.d(a).e();
        if (c_1.a != null)
        {
            int i = 0;
            do
            {
                if (i >= c_1.a.length)
                {
                    break;
                }
                s = c_1.a[i];
                c_.b(s, z[2]);
                if (z[5].equals(s.d(z[0])))
                {
                    s = s.d(z[3]);
                    if (s != null)
                    {
                        cu.d(a).b(s);
                    }
                }
                i++;
            } while (j == 0);
        }
        cu.d(a).d();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "d\n\023A";
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
                obj = "a\006\006V<";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "y\007\006I";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "f\022\017Q ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "|\032\020P";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "z\032\007";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 69;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 115;
          goto _L9
_L6:
        byte1 = 99;
          goto _L9
        byte1 = 36;
          goto _L9
    }
}
