// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.protocol.bs;
import com.whatsapp.protocol.ci;

public final class w
{

    private static final String z[];
    public final Runnable a;
    public final bs b;
    public final byte c[];
    public final ci d;

    public w(byte abyte0[], Runnable runnable, ci ci, bs bs)
    {
        c = abyte0;
        a = runnable;
        d = ci;
        b = bs;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(z[2]);
        int i;
        if (c != null)
        {
            i = c.length;
        } else
        {
            i = 0;
        }
        return stringbuilder.append(i).append(z[0]).append(z[4]).append(a).append(z[1]).append(d).append(z[3]).append(b).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "G2d?r\024";
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
                obj = "Kpx9e\b\"^*{\0132|(|Z";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "45s/Q\0165q/D\0231i8l\0019x's4$|?d%<r)*";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Kpo.v\003\025o9x\025\023|'{\0051~ *";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "Kpn>t\0045n8T\006<q)v\004; ";
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
        byte byte1 = 23;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 103;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 29;
          goto _L9
        byte1 = 75;
          goto _L9
    }
}
