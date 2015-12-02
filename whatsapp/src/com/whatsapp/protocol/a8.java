// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, c_, c4, cu, 
//            cp

class a8 extends c
{

    private static final String z[];
    final cu a;

    a8(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(c_ c_1, String s)
    {
        String s1;
        Object obj;
        long l2;
        c_1 = c_1.a(0);
        s1 = c_1.d(z[4]);
        obj = c_1.d(z[5]);
        l2 = 0L;
        long l = Long.parseLong(((String) (obj)));
        l2 = l * 1000L;
_L1:
        String s2;
        String s3;
        long l3;
        s2 = c_1.d(z[1]);
        s3 = c_1.d(z[6]);
        l3 = 0L;
        l = Long.parseLong(s3);
        l3 = l * 1000L;
_L2:
        String s4 = c_1.d(z[2]);
        String s5 = c_1.d(z[3]);
        String s6 = c_1.d(z[7]);
        long l4 = 0L;
        long l1 = l4;
        if (s6 == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        boolean flag;
        try
        {
            flag = s6.equals(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        l1 = l4;
        if (flag)
        {
            l4 = -1L;
            l1 = l4;
            if (c4.F == 0)
            {
                break MISSING_BLOCK_LABEL_191;
            }
            l1 = l4;
        }
        l4 = Math.max(0L, Long.parseLong(((String) (obj))) * 1000L);
        l1 = l4;
_L3:
        obj = new Hashtable();
        cu.a(a, c_1, ((Hashtable) (obj)));
        cu.a(a).a(s, s1, l2, s2, l3, s4, s5, l1, ((Hashtable) (obj)));
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L1
        NumberFormatException numberformatexception2;
        numberformatexception2;
          goto _L2
        NumberFormatException numberformatexception1;
        numberformatexception1;
          goto _L3
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "vk=92v\17705";
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
                obj = "dh>:;ti";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "dB3";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "cd,5";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "to91*xo";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "to91*~r2";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "dB(";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "{r?1*~r2";
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
        byte byte1 = 94;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 23;
          goto _L9
_L5:
        byte1 = 29;
          goto _L9
_L6:
        byte1 = 92;
          goto _L9
        byte1 = 80;
          goto _L9
    }
}
