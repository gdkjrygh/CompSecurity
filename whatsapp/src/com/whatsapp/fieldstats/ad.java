// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class ad extends Enum
{

    public static final ad DAILY;
    public static final ad MONTHLY;
    public static final ad WEEKLY;
    private static final ad a[];
    private static final String z[];
    private final int b;

    private ad(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/whatsapp/fieldstats/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "iT\004\005?";
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
                obj = "`Z\003\035.aL";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "zP\b\002*t";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                DAILY = new ad(z[0], 0, 1);
                WEEKLY = new ad(z[2], 1, 2);
                MONTHLY = new ad(z[1], 2, 3);
                a = (new ad[] {
                    DAILY, WEEKLY, MONTHLY
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 253
    //                   1 259
    //                   2 265
    //                   3 271;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_271;
_L3:
        byte byte0 = 102;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 45;
          goto _L9
_L5:
        byte0 = 21;
          goto _L9
_L6:
        byte0 = 77;
          goto _L9
        byte0 = 73;
          goto _L9
    }
}
