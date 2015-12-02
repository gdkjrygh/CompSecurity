// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;


// Referenced classes of package com.whatsapp.util:
//            a_

public class at extends a_
{

    private static final String z[];
    protected a_ d[];

    protected at(long l, String s, a_ aa_[])
    {
        super(l, s);
        d = aa_;
    }

    public a_[] a()
    {
        return d;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(b).append(z[1]).append(a).append(z[2]).append(d.length);
        String s;
        if (d.length == 1)
        {
            s = z[0];
        } else
        {
            s = z[3];
        }
        return stringbuilder.append(s).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "gf,e(#";
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
                obj = "g-";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "gg=x!4,d!d";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "gf,e(#w!b";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 208
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 68;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 71;
          goto _L9
_L5:
        byte0 = 5;
          goto _L9
_L6:
        byte0 = 68;
          goto _L9
        byte0 = 12;
          goto _L9
    }
}
