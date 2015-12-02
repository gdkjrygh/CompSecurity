// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class b8 extends Enum
{

    public static final b8 EXISTING;
    public static final b8 FROM_LIMBO;
    public static final b8 NEW;
    public static final b8 WIPED;
    private static final b8 b[];
    private static final String z[];
    private final int a;

    private b8(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static b8 valueOf(String s)
    {
        return (b8)Enum.valueOf(com/whatsapp/fieldstats/b8, s);
    }

    public static b8[] values()
    {
        return (b8[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\n\027r4\t\006\001|";
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
                obj = "\t\035t*\002\003\006v%\022";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\001\nl";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\030\006k\"\031";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                NEW = new b8(z[2], 0, 1);
                EXISTING = new b8(z[0], 1, 2);
                FROM_LIMBO = new b8(z[1], 2, 3);
                WIPED = new b8(z[3], 3, 4);
                b = (new b8[] {
                    NEW, EXISTING, FROM_LIMBO, WIPED
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
        byte byte0 = 93;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 79;
          goto _L9
_L5:
        byte0 = 79;
          goto _L9
_L6:
        byte0 = 59;
          goto _L9
        byte0 = 103;
          goto _L9
    }
}
