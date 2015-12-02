// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


final class cx extends Enum
{

    public static final cx ALPHA;
    public static final cx ALPHA_SHIFT;
    public static final cx LOWER;
    public static final cx MIXED;
    public static final cx PUNCT;
    public static final cx PUNCT_SHIFT;
    private static final cx a[];
    private static final String z[];

    private cx(String s, int i)
    {
        super(s, i);
    }

    public static cx valueOf(String s)
    {
        return (cx)Enum.valueOf(com/google/cx, s);
    }

    public static cx[] values()
    {
        return (cx[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "p+\002xyn4\032y~e";
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
                obj = "|.\nu|";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "p+\002xy";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "a2\034sln4\032y~e";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "a2\034sl";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "}(\005uj";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                ALPHA = new cx(z[2], 0);
                LOWER = new cx(z[5], 1);
                MIXED = new cx(z[1], 2);
                PUNCT = new cx(z[4], 3);
                ALPHA_SHIFT = new cx(z[0], 4);
                PUNCT_SHIFT = new cx(z[3], 5);
                a = (new cx[] {
                    ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT
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
        byte byte1 = 56;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 49;
          goto _L9
_L5:
        byte1 = 103;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 48;
          goto _L9
    }
}
