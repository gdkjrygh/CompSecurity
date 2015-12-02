// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class ou extends Enum
{

    public static final ou ERROR_CONNECTIVITY;
    public static final ou ERROR_UNSPECIFIED;
    public static final ou EXPIRED;
    public static final ou FAIL_BLOCKED;
    public static final ou FAIL_GUESSED_TOO_FAST;
    public static final ou FAIL_MISMATCH;
    public static final ou FAIL_MISSING;
    public static final ou FAIL_STALE;
    public static final ou FAIL_TEMPORARILY_UNAVAILABLE;
    public static final ou FAIL_TOO_MANY_GUESSES;
    public static final ou YES;
    private static final ou a[];
    private static final String z[];

    private ou(String s, int i)
    {
        super(s, i);
    }

    public static ou valueOf(String s)
    {
        return (ou)Enum.valueOf(com/whatsapp/ou, s);
    }

    public static ou[] values()
    {
        return (ou[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "ap\026";
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
                obj = "}g\027angv\n`r}v\021gjqa\034";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "~t\fbczy\nmw}q";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "~t\fbclz\nqqy{\034q{mp\026}yk";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "}m\025gn}q";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "~t\fbcu|\026}uvr";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "~t\fbcka\004by";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "~t\fbcu|\026c}lv\r";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "~t\fbc\177`\000}o}q\032zswj\003ool";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "}g\027ang`\013}l}v\fhu}q";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "~t\fbclp\b~sjt\027gpaj\020`}nt\fb}zy\0";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                YES = new ou(z[0], 0);
                EXPIRED = new ou(z[4], 1);
                ERROR_UNSPECIFIED = new ou(z[9], 2);
                ERROR_CONNECTIVITY = new ou(z[1], 3);
                FAIL_MISMATCH = new ou(z[7], 4);
                FAIL_TOO_MANY_GUESSES = new ou(z[3], 5);
                FAIL_GUESSED_TOO_FAST = new ou(z[8], 6);
                FAIL_MISSING = new ou(z[5], 7);
                FAIL_STALE = new ou(z[6], 8);
                FAIL_TEMPORARILY_UNAVAILABLE = new ou(z[10], 9);
                FAIL_BLOCKED = new ou(z[2], 10);
                a = (new ou[] {
                    YES, EXPIRED, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, 
                    FAIL_BLOCKED
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 588
    //                   0 611
    //                   1 618
    //                   2 625
    //                   3 632;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_632;
_L3:
        byte byte1 = 60;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 56;
          goto _L9
_L5:
        byte1 = 53;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 46;
          goto _L9
    }
}
