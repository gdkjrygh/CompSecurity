// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class fi extends Enum
{

    public static final fi E164;
    public static final fi INTERNATIONAL;
    public static final fi NATIONAL;
    public static final fi RFC3966;
    private static final fi a[];
    private static final String z[];

    private fi(String s, int i)
    {
        super(s, i);
    }

    public static fi valueOf(String s)
    {
        return (fi)Enum.valueOf(com/google/fi, s);
    }

    public static fi[] values()
    {
        return (fi[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "/1<s\177(><\177b(>$";
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
                obj = "49+\005\024PI";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "#N^\002";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "(><\177b(>$";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                E164 = new fi(z[2], 0);
                INTERNATIONAL = new fi(z[0], 1);
                NATIONAL = new fi(z[3], 2);
                RFC3966 = new fi(z[1], 3);
                a = (new fi[] {
                    E164, INTERNATIONAL, NATIONAL, RFC3966
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 45;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 102;
          goto _L9
_L5:
        byte0 = 127;
          goto _L9
_L6:
        byte0 = 104;
          goto _L9
        byte0 = 54;
          goto _L9
    }
}
