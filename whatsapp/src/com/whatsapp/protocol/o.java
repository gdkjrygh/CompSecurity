// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_

class o extends c
{

    private static final String z[];
    final cu a;

    o(cu cu1)
    {
        a = cu1;
        super();
    }

    public void a(int i)
    {
        cu.d(a).b(new Integer(i));
    }

    public void a(c_ c_1, String s)
    {
label0:
        {
            int l = c4.F;
            s = c_1.a(z[0]);
            if (s != null && ((c_) (s)).a != null)
            {
                c_1 = new String[((c_) (s)).a.length];
                int i = 0;
                int j = 0;
                do
                {
                    if (i >= ((c_) (s)).a.length)
                    {
                        break;
                    }
                    Object obj = ((c_) (s)).a[i];
                    c_.b(((c_) (obj)), z[4]);
                    String s1 = ((c_) (obj)).d(z[3]);
                    obj = ((c_) (obj)).d(z[2]);
                    int k = j;
                    if (z[1].equals(obj))
                    {
                        c_1[j] = s1;
                        k = j + 1;
                    }
                    i++;
                    j = k;
                } while (l == 0);
                if (l == 0)
                {
                    break label0;
                }
            }
            c_1 = new String[0];
        }
        cu.d(a).a(c_1);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\023{/s?\024{#";
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
                obj = "\002e3q";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\023{/s?\024{#";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\034~\"";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\003d#f";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 86;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 118;
          goto _L9
_L5:
        byte1 = 23;
          goto _L9
_L6:
        byte1 = 70;
          goto _L9
        byte1 = 20;
          goto _L9
    }
}
