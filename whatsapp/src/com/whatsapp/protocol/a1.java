// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c_, cu, 
//            cp, cj

class a1 extends c
{

    private static final String z[];
    final cu a;
    final cj b;
    final ci c;

    a1(cu cu1, cj cj1, ci ci1)
    {
        a = cu1;
        b = cj1;
        c = ci1;
        super();
    }

    public void a(int i, String s)
    {
        ci ci1 = c;
        if (ci1 != null)
        {
            int j = i;
            if (i == 500)
            {
                j = i;
                if (s != null)
                {
                    boolean flag;
                    try
                    {
                        flag = s.equals(z[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw s;
                    }
                    j = i;
                    if (flag)
                    {
                        j = -500;
                    }
                }
            }
            c.a(j);
        }
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
    }

    public void a(c_ c_1, String s)
    {
        String s1;
        Object obj;
        String s2;
        long l;
        obj = c_1.a(0);
        c_.b(((c_) (obj)), z[6]);
        s = ((c_) (obj)).d(z[3]);
        s = cu.a(a, s);
        s1 = ((c_) (obj)).d(z[9]);
        s2 = ((c_) (obj)).d(z[2]);
        l = 0L;
        long l1 = Long.parseLong(s2);
        l = l1 * 1000L;
_L1:
        String s3;
        s2 = ((c_) (obj)).d(z[4]);
        s3 = ((c_) (obj)).d(z[7]);
        l1 = 0L;
        long l2 = Long.parseLong(s3);
        l1 = l2 * 1000L;
_L2:
        String s4 = ((c_) (obj)).d(z[5]);
        obj = ((c_) (obj)).d(z[8]);
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable1 = new Hashtable();
        try
        {
            cu.a(a, c_1, hashtable, hashtable1, z[1]);
            cu.a(a).a(s, s1, l, s2, l1, s4, ((String) (obj)), hashtable, hashtable1);
            if (b != null)
            {
                b.a(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L1
        NumberFormatException numberformatexception1;
        numberformatexception1;
          goto _L2
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "7Mi`10Bq(0;Qk`1sFow,,";
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
                obj = "9Qrp3";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "=Qxd77Ls";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "7G";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "-V\177o&=W";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "-|r";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "9Qrp3";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "-|i";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "*Zm`";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "=Qxd71Q";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 67;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 94;
          goto _L9
_L5:
        byte1 = 35;
          goto _L9
_L6:
        byte1 = 29;
          goto _L9
        byte1 = 5;
          goto _L9
    }
}
