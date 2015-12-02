// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class as extends Enum
{

    public static final as EMAIL_SEND;
    public static final as PROBLEM_DESCRIPTION;
    public static final as SUGGESTED_FAQ;
    private static final as a[];
    private static final String z[];
    private final int b;

    private as(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static as valueOf(String s)
    {
        return (as)Enum.valueOf(com/whatsapp/fieldstats/as, s);
    }

    public static as[] values()
    {
        return (as[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte1;
        int i;
        as1 = new String[3];
        obj = "n\013yH4n\n{K.{\037o";
        byte1 = -1;
        i = 0;
_L2:
        String as2[];
        int j;
        int k;
        as2 = as1;
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
                as2[i] = ((String) (obj));
                obj = "m\fqM=x\023aK4n\035lF!i\027qA";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "x\023\177F=b\r{A5";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                z = as1;
                PROBLEM_DESCRIPTION = new as(z[1], 0, 1);
                SUGGESTED_FAQ = new as(z[0], 1, 2);
                EMAIL_SEND = new as(z[2], 2, 3);
                a = (new as[] {
                    PROBLEM_DESCRIPTION, SUGGESTED_FAQ, EMAIL_SEND
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
        byte byte0 = 113;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 61;
          goto _L9
_L5:
        byte0 = 94;
          goto _L9
_L6:
        byte0 = 62;
          goto _L9
        byte0 = 15;
          goto _L9
    }
}
