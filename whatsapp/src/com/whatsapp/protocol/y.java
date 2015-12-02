// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_

class y extends c
{

    private static final String z[];
    final cu a;
    final String b;
    final String c;
    final String d;

    y(cu cu1, String s, String s1, String s2)
    {
        a = cu1;
        d = s;
        b = s1;
        c = s2;
        super();
    }

    public void a(int i)
    {
label0:
        {
            if (i == 404)
            {
                cu.d(a).a(c, null, null, b);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            cu.d(a).b(c, i);
        }
    }

    public void a(c_ c_1, String s)
    {
        c_ c_2 = c_1.a(z[0]);
        String s1 = d;
        c_1 = null;
        if (c_2 != null)
        {
            c_1 = c_2.b;
            s1 = c_2.d(z[1]);
        }
        if (s != null)
        {
            cu.d(a).a(s, s1, c_1, b);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "C-\0216\bA!";
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
                obj = "Z ";
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
        byte byte0 = 125;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 51;
          goto _L9
_L5:
        byte0 = 68;
          goto _L9
_L6:
        byte0 = 114;
          goto _L9
        byte0 = 66;
          goto _L9
    }
}
