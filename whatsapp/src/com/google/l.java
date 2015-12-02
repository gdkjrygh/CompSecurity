// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class l extends Enum
{

    public static final l AZTEC_LAYERS;
    public static final l CHARACTER_SET;
    public static final l DATA_MATRIX_SHAPE;
    public static final l ERROR_CORRECTION;
    public static final l MARGIN;
    public static final l MAX_SIZE;
    public static final l MIN_SIZE;
    public static final l PDF417_COMPACT;
    public static final l PDF417_COMPACTION;
    public static final l PDF417_DIMENSIONS;
    private static final l a[];
    private static final String z[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/google/l, s);
    }

    public static l[] values()
    {
        return (l[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "\024=\007\037p\024!\003\037n\0040\022";
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
                obj = "\022'\024\002c\b6\t\037c\0226\022\004~\031";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\032<\b\022b\036/\003";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\0234\022\fn\0324\022\037x\017*\025\005p\0070";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\026/\022\br\b9\007\024t\005&";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\0324\036\022b\036/\003";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\0324\024\nx\031";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\0071\000y\000`*\005\002|\0074\005\031";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\0071\000y\000`*\005\002|\0074\005\031x\030;";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\0071\000y\000`*\002\004|\022;\025\004~\031&";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                ERROR_CORRECTION = new l(z[1], 0);
                CHARACTER_SET = new l(z[0], 1);
                DATA_MATRIX_SHAPE = new l(z[3], 2);
                MIN_SIZE = new l(z[2], 3);
                MAX_SIZE = new l(z[5], 4);
                MARGIN = new l(z[6], 5);
                PDF417_COMPACT = new l(z[7], 6);
                PDF417_COMPACTION = new l(z[8], 7);
                PDF417_DIMENSIONS = new l(z[9], 8);
                AZTEC_LAYERS = new l(z[4], 9);
                a = (new l[] {
                    ERROR_CORRECTION, CHARACTER_SET, DATA_MATRIX_SHAPE, MIN_SIZE, MAX_SIZE, MARGIN, PDF417_COMPACT, PDF417_COMPACTION, PDF417_DIMENSIONS, AZTEC_LAYERS
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 540
    //                   0 563
    //                   1 570
    //                   2 577
    //                   3 584;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_584;
_L3:
        byte byte1 = 49;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 87;
          goto _L9
_L5:
        byte1 = 117;
          goto _L9
_L6:
        byte1 = 70;
          goto _L9
        byte1 = 77;
          goto _L9
    }
}
