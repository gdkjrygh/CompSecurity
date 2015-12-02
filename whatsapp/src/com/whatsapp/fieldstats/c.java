// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class c extends Enum
{

    public static final c CORRUPT;
    public static final c MANUAL;
    public static final c RESUME;
    private static final c a[];
    private static final String z[];
    private final int b;

    private c(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/whatsapp/fieldstats/c, s);
    }

    public static c[] values()
    {
        return (c[])a.clone();
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
        obj = "Q.\f\002\"F";
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
                obj = "@$\r\005:S?";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "N*\021\002.O";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                MANUAL = new c(z[2], 0, 1);
                RESUME = new c(z[0], 1, 2);
                CORRUPT = new c(z[1], 2, 3);
                a = (new c[] {
                    MANUAL, RESUME, CORRUPT
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 232
    //                   0 253
    //                   1 258
    //                   2 264
    //                   3 270;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_270;
_L3:
        byte byte0 = 111;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 3;
          goto _L9
_L5:
        byte0 = 107;
          goto _L9
_L6:
        byte0 = 95;
          goto _L9
        byte0 = 87;
          goto _L9
    }
}
