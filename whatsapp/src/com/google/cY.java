// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class cY extends Enum
{

    public static final cY BINARY;
    public static final cY DIGIT;
    public static final cY LOWER;
    public static final cY MIXED;
    public static final cY PUNCT;
    public static final cY UPPER;
    private static final cY a[];
    private static final String z[];

    private cY(String s, int i)
    {
        super(s, i);
    }

    public static cY valueOf(String s)
    {
        return (cY)Enum.valueOf(com/google/cY, s);
    }

    public static cY[] values()
    {
        return (cY[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "Vtam\006";
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
                obj = "Gmva\0";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "^rqa\0";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "_t~a\026";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Bhhg\006";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Pthe\000K";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                UPPER = new cY(z[1], 0);
                LOWER = new cY(z[2], 1);
                MIXED = new cY(z[3], 2);
                DIGIT = new cY(z[0], 3);
                PUNCT = new cY(z[4], 4);
                BINARY = new cY(z[5], 5);
                a = (new cY[] {
                    UPPER, LOWER, MIXED, DIGIT, PUNCT, BINARY
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 356
    //                   0 379
    //                   1 386
    //                   2 393
    //                   3 400;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_400;
_L3:
        byte byte1 = 82;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 18;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 38;
          goto _L9
        byte1 = 36;
          goto _L9
    }
}
