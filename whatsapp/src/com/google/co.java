// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class co extends Enum
{

    public static final co FROM_DEFAULT_COUNTRY;
    public static final co FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final co FROM_NUMBER_WITH_IDD;
    public static final co FROM_NUMBER_WITH_PLUS_SIGN;
    private static final co a[];
    private static final String z[];

    private co(String s, int i)
    {
        super(s, i);
    }

    public static co valueOf(String s)
    {
        return (co)Enum.valueOf(com/google/co, s);
    }

    public static co[] values()
    {
        return (co[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "^&V6mV!T9wJ+N2fP;L/mH8L(mK=^5";
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
                obj = "^&V6mV!T9wJ+N2fP+I7gK+J2uV";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "^&V6m\\1_:gT F8}M:M)k";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "^&V6mV!T9wJ+N2fP+P?v";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                FROM_NUMBER_WITH_PLUS_SIGN = new co(z[1], 0);
                FROM_NUMBER_WITH_IDD = new co(z[3], 1);
                FROM_NUMBER_WITHOUT_PLUS_SIGN = new co(z[0], 2);
                FROM_DEFAULT_COUNTRY = new co(z[2], 3);
                a = (new co[] {
                    FROM_NUMBER_WITH_PLUS_SIGN, FROM_NUMBER_WITH_IDD, FROM_NUMBER_WITHOUT_PLUS_SIGN, FROM_DEFAULT_COUNTRY
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
        byte byte0 = 50;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 24;
          goto _L9
_L5:
        byte0 = 116;
          goto _L9
_L6:
        byte0 = 25;
          goto _L9
        byte0 = 123;
          goto _L9
    }
}
