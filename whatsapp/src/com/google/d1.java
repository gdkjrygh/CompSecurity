// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class d1 extends Enum
{

    public static final d1 INVALID_COUNTRY_CODE;
    public static final d1 NOT_A_NUMBER;
    public static final d1 TOO_LONG;
    public static final d1 TOO_SHORT_AFTER_IDD;
    public static final d1 TOO_SHORT_NSN;
    private static final d1 a[];
    private static final String z[];

    private d1(String s, int i)
    {
        super(s, i);
    }

    public static d1 valueOf(String s)
    {
        return (d1)Enum.valueOf(com/google/d1, s);
    }

    public static d1[] values()
    {
        return (d1[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\002'z&s\036'g-\177\030;{";
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
                obj = "\030'a&a\t&`4b\023:";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\002'z&s\036'g-\177\027.a<r\t!q=";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\037&c8l\037,j:o\003&a+y\t+z=e";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\002'z&l\031&r";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                INVALID_COUNTRY_CODE = new d1(z[3], 0);
                NOT_A_NUMBER = new d1(z[1], 1);
                TOO_SHORT_AFTER_IDD = new d1(z[2], 2);
                TOO_SHORT_NSN = new d1(z[0], 3);
                TOO_LONG = new d1(z[4], 4);
                a = (new d1[] {
                    INVALID_COUNTRY_CODE, NOT_A_NUMBER, TOO_SHORT_AFTER_IDD, TOO_SHORT_NSN, TOO_LONG
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 308
    //                   0 331
    //                   1 338
    //                   2 345
    //                   3 352;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_352;
_L3:
        byte byte1 = 32;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 86;
          goto _L9
_L5:
        byte1 = 104;
          goto _L9
_L6:
        byte1 = 53;
          goto _L9
        byte1 = 121;
          goto _L9
    }
}
