// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


final class bw
{

    private static final String z[];
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public bw(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        c = flag;
        a = flag1;
        b = flag2;
        d = flag3;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[2]).append(c).append(z[1]).append(a).append(z[3]).append(d).append(z[0]).append(b).append('}').toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "uu<b4-\0001k':=6|0=h";
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
                obj = "uu<b4-\024;n0=h";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\0301;X0* 3~..4,Y :6:y&d";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "uu6y\021,%3c68!:7";
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
        byte byte0 = 85;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 89;
          goto _L9
_L5:
        byte0 = 85;
          goto _L9
_L6:
        byte0 = 95;
          goto _L9
        byte0 = 10;
          goto _L9
    }
}
