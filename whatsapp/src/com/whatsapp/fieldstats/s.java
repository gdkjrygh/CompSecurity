// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class s extends Enum
{

    public static final s NO_TIMESTAMP;
    public static final s PARSE;
    public static final s TIME_SHIFT;
    public static final s TOO_OLD;
    private static final s b[];
    private static final String z[];
    private final int a;

    private s(String s1, int i, int j)
    {
        super(s1, i);
        a = j;
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/whatsapp/fieldstats/s, s1);
    }

    public static s[] values()
    {
        return (s[])b.clone();
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
        obj = "0\f*\0077(\007";
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
                obj = "0\n(\035'7\013,\036,";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "4\0027\013=";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "*\f:\f1)\0066\f9)\023";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                NO_TIMESTAMP = new s(z[3], 0, 1);
                TIME_SHIFT = new s(z[1], 1, 2);
                TOO_OLD = new s(z[0], 2, 4);
                PARSE = new s(z[2], 3, 3);
                b = (new s[] {
                    NO_TIMESTAMP, TIME_SHIFT, TOO_OLD, PARSE
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
        byte byte0 = 120;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 100;
          goto _L9
_L5:
        byte0 = 67;
          goto _L9
_L6:
        byte0 = 101;
          goto _L9
        byte0 = 88;
          goto _L9
    }
}
