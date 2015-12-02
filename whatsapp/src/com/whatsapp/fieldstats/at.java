// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class at extends Enum
{

    public static final at ERROR_UNKNOWN;
    public static final at OK;
    public static final at OK_AFTER_RETRY;
    private static final at a[];
    private static final String z[];
    private final int b;

    private at(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static at valueOf(String s)
    {
        return (at)Enum.valueOf(com/whatsapp/fieldstats/at, s);
    }

    public static at[] values()
    {
        return (at[])a.clone();
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
        obj = "=\"^V\n'%BR\0267'B";
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
                obj = "7;";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "7;SX\036,5^F\n=$^@";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                OK = new at(z[1], 0, 1);
                OK_AFTER_RETRY = new at(z[2], 1, 2);
                ERROR_UNKNOWN = new at(z[0], 2, 3);
                a = (new at[] {
                    OK, OK_AFTER_RETRY, ERROR_UNKNOWN
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
        byte byte0 = 88;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 120;
          goto _L9
_L5:
        byte0 = 112;
          goto _L9
_L6:
        byte0 = 12;
          goto _L9
        byte0 = 25;
          goto _L9
    }
}
