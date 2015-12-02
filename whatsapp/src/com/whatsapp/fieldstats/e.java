// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class e extends Enum
{

    public static final e ANDROID;
    public static final e BB;
    public static final e BBX;
    public static final e IPHONE;
    public static final e S40;
    public static final e SYMBIAN;
    public static final e TEST;
    public static final e UNKNOWN;
    public static final e WEBCLIENT;
    public static final e WP;
    private static final e a[];
    private static final String z[];
    private final int b;

    private e(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/whatsapp/fieldstats/e, s);
    }

    public static e[] values()
    {
        return (e[])a.clone();
    }

    public int getCode()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "\016\\EH";
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
                obj = "\033WRN\004\023]";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\t-&";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\t@[^\002\033W";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\023I^S\005\037";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\030[N";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\030[";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\r\\T_\007\023\\XH";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\017W]R\004\rW";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\rI";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                IPHONE = new e(z[4], 0, 1);
                ANDROID = new e(z[1], 1, 2);
                BB = new e(z[6], 2, 3);
                BBX = new e(z[5], 3, 7);
                S40 = new e(z[2], 4, 4);
                SYMBIAN = new e(z[3], 5, 5);
                WP = new e(z[9], 6, 6);
                WEBCLIENT = new e(z[7], 7, 8);
                TEST = new e(z[0], 8, 9);
                UNKNOWN = new e(z[8], 9, 10);
                a = (new e[] {
                    IPHONE, ANDROID, BB, BBX, S40, SYMBIAN, WP, WEBCLIENT, TEST, UNKNOWN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 556
    //                   0 579
    //                   1 586
    //                   2 593
    //                   3 600;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_600;
_L3:
        byte byte1 = 75;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 90;
          goto _L9
_L5:
        byte1 = 25;
          goto _L9
_L6:
        byte1 = 22;
          goto _L9
        byte1 = 28;
          goto _L9
    }
}
