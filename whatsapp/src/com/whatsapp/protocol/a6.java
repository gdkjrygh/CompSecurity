// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bn, c_, 
//            bp

class a6 extends c
{

    private static final String z[];
    final cu a;

    a6(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(int i)
    {
        if (i != 404)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        cu.c(a).b(0);
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        throw numberformatexception;
    }

    public void a(c_ c_1, String s)
    {
        c_1 = c_.a(c_1.a(z[3])).e(z[0]);
        int i;
        try
        {
            i = Integer.parseInt(c_1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new bp((new StringBuilder()).append(z[2]).append(c_1).append(z[1]).toString());
        }
        cu.c(a).b(i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "<gfN]";
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
                obj = "m&}ZKjheO\030$sg^J#e";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "<gfN]j!";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = ")i\177UL";
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
        byte byte0 = 56;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 74;
          goto _L9
_L5:
        byte0 = 6;
          goto _L9
_L6:
        byte0 = 10;
          goto _L9
        byte0 = 59;
          goto _L9
    }
}
