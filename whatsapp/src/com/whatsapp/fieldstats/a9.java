// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class a9 extends Enum
{

    public static final a9 ERROR_MAX_RETRY;
    public static final a9 ERROR_UNKNOWN;
    public static final a9 OK;
    public static final a9 OK_AFTER_RETRY;
    private static final a9 a[];
    private static final String z[];
    private final int b;

    private a9(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static a9 valueOf(String s)
    {
        return (a9)Enum.valueOf(com/whatsapp/fieldstats/a9, s);
    }

    public static a9[] values()
    {
        return (a9[])a.clone();
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
        as = new String[4];
        obj = "+\n";
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
                obj = "+\n?\002l0\0042\034x!\0252\032";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "!\0232\fx;\f!\033u6\0044\021s";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "!\0232\fx;\024.\bd+\026.";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                OK = new a9(z[0], 0, 1);
                OK_AFTER_RETRY = new a9(z[1], 1, 2);
                ERROR_UNKNOWN = new a9(z[3], 2, 3);
                ERROR_MAX_RETRY = new a9(z[2], 3, 4);
                a = (new a9[] {
                    OK, OK_AFTER_RETRY, ERROR_UNKNOWN, ERROR_MAX_RETRY
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 276
    //                   0 297
    //                   1 303
    //                   2 309
    //                   3 315;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_315;
_L3:
        byte byte0 = 42;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 100;
          goto _L9
_L5:
        byte0 = 65;
          goto _L9
_L6:
        byte0 = 96;
          goto _L9
        byte0 = 67;
          goto _L9
    }
}
