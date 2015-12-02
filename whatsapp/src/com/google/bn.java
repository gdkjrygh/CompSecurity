// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            c2

public final class bn extends Enum
{

    public static final bn ALPHANUMERIC;
    public static final bn BYTE;
    public static final bn ECI;
    public static final bn FNC1_FIRST_POSITION;
    public static final bn FNC1_SECOND_POSITION;
    public static final bn HANZI;
    public static final bn KANJI;
    public static final bn NUMERIC;
    public static final bn STRUCTURED_APPEND;
    public static final bn TERMINATOR;
    private static final bn a[];
    private static final String z[];
    private final int b;
    private final int c[];

    private bn(String s, int i, int ai[], int j)
    {
        super(s, i);
        c = ai;
        b = j;
    }

    public static bn forBits(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        default:
            throw new IllegalArgumentException();

        case 0: // '\0'
            bn bn1;
            try
            {
                bn1 = TERMINATOR;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            return bn1;

        case 1: // '\001'
            return NUMERIC;

        case 2: // '\002'
            return ALPHANUMERIC;

        case 3: // '\003'
            return STRUCTURED_APPEND;

        case 4: // '\004'
            return BYTE;

        case 5: // '\005'
            return FNC1_FIRST_POSITION;

        case 7: // '\007'
            return ECI;

        case 8: // '\b'
            return KANJI;

        case 9: // '\t'
            return FNC1_SECOND_POSITION;

        case 13: // '\r'
            return HANZI;
        }
    }

    public static bn valueOf(String s)
    {
        return (bn)Enum.valueOf(com/google/bn, s);
    }

    public static bn[] values()
    {
        return (bn[])a.clone();
    }

    public int getBits()
    {
        return b;
    }

    public int getCharacterCountBits(c2 c2_1)
    {
        byte byte0;
label0:
        {
            boolean flag = c2.g;
            int i = c2_1.d();
            if (i <= 9)
            {
                byte0 = 0;
                if (!flag)
                {
                    break label0;
                }
            }
            if (i <= 26)
            {
                byte0 = 1;
                if (!flag)
                {
                    break label0;
                }
            }
            byte0 = 2;
        }
        return c[byte0];
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "\016r*wz\ts*g}\002g(r|\023b";
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
                obj = "\030e1";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\037\177,g";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\026g6hp";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\025g6xp";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\tc*op\023g,mk";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\023s5gk\024e";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\033h;\023f\033o*qm\002v7qp\to7l";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\033h;\023f\016c;mw\031y(mj\024r1mw";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\034j(jx\023s5gk\024e";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                TERMINATOR = new bn(z[5], 0, new int[] {
                    0, 0, 0
                }, 0);
                NUMERIC = new bn(z[6], 1, new int[] {
                    10, 12, 14
                }, 1);
                ALPHANUMERIC = new bn(z[9], 2, new int[] {
                    9, 11, 13
                }, 2);
                STRUCTURED_APPEND = new bn(z[0], 3, new int[] {
                    0, 0, 0
                }, 3);
                BYTE = new bn(z[2], 4, new int[] {
                    8, 16, 16
                }, 4);
                ECI = new bn(z[1], 5, new int[] {
                    0, 0, 0
                }, 7);
                KANJI = new bn(z[3], 6, new int[] {
                    8, 10, 12
                }, 8);
                FNC1_FIRST_POSITION = new bn(z[7], 7, new int[] {
                    0, 0, 0
                }, 5);
                FNC1_SECOND_POSITION = new bn(z[8], 8, new int[] {
                    0, 0, 0
                }, 9);
                HANZI = new bn(z[4], 9, new int[] {
                    8, 10, 12
                }, 13);
                a = (new bn[] {
                    TERMINATOR, NUMERIC, ALPHANUMERIC, STRUCTURED_APPEND, BYTE, ECI, KANJI, FNC1_FIRST_POSITION, FNC1_SECOND_POSITION, HANZI
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 720
    //                   0 743
    //                   1 750
    //                   2 757
    //                   3 764;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_764;
_L3:
        byte byte1 = 57;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 93;
          goto _L9
_L5:
        byte1 = 38;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 34;
          goto _L9
    }
}
