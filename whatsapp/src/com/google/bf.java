// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class bf extends Enum
{

    public static final bf INVALID_COUNTRY_CODE;
    public static final bf IS_POSSIBLE;
    public static final bf TOO_LONG;
    public static final bf TOO_SHORT;
    private static final bf a[];
    private static final String z[];

    private bf(String s, int i)
    {
        super(s, i);
    }

    public static bf valueOf(String s)
    {
        return (bf)Enum.valueOf(com/google/bf, s);
    }

    public static bf[] values()
    {
        return (bf[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "ky\032u\007qy\fg\004g";
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
                obj = "ve\nz\004md\002";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "ve\nz\033je\027q";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "kd\023d\004kn\032f\007wd\021w\021}i\na\r";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                IS_POSSIBLE = new bf(z[0], 0);
                INVALID_COUNTRY_CODE = new bf(z[3], 1);
                TOO_SHORT = new bf(z[2], 2);
                TOO_LONG = new bf(z[1], 3);
                a = (new bf[] {
                    IS_POSSIBLE, INVALID_COUNTRY_CODE, TOO_SHORT, TOO_LONG
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
        byte byte0 = 72;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 34;
          goto _L9
_L5:
        byte0 = 42;
          goto _L9
_L6:
        byte0 = 69;
          goto _L9
        byte0 = 37;
          goto _L9
    }
}
