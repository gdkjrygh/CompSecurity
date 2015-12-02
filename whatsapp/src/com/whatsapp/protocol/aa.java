// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_

class aa extends c
{

    private static final String z[];
    final cu a;

    aa(cu cu1)
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
                cu.d(a).j(null, null);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            cu.d(a).c(i);
        }
    }

    public void a(c_ c_1, String s)
    {
        s = c_1.a(0);
        c_.b(s, z[2]);
        c_1 = s.d(z[0]);
        s = s.d(z[1]);
        cu.d(a).j(c_1, s);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\005\f9[\020\032\0225";
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
                obj = "\034\004";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\026\0176I\037\022";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 118;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 117;
          goto _L9
_L5:
        byte0 = 96;
          goto _L9
_L6:
        byte0 = 88;
          goto _L9
        byte0 = 47;
          goto _L9
    }
}
