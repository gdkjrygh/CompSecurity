// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


public final class b3 extends Enum
{

    public static final b3 EXACT_MATCH;
    public static final b3 NOT_A_NUMBER;
    public static final b3 NO_MATCH;
    public static final b3 NSN_MATCH;
    public static final b3 SHORT_NSN_MATCH;
    private static final b3 a[];
    private static final String z[];

    private b3(String s, int i)
    {
        super(s, i);
    }

    public static b3 valueOf(String s)
    {
        return (b3)Enum.valueOf(com/google/b3, s);
    }

    public static b3[] values()
    {
        return (b3[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "C`NwCYlY";
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
                obj = "C|_eOL{Rr";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "C`EeCRaDw@H}";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "HwPyVRbPnAE";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "^g^hVRaBt]@nEyJ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                NOT_A_NUMBER = new b3(z[2], 0);
                NO_MATCH = new b3(z[0], 1);
                SHORT_NSN_MATCH = new b3(z[4], 2);
                NSN_MATCH = new b3(z[1], 3);
                EXACT_MATCH = new b3(z[3], 4);
                a = (new b3[] {
                    NOT_A_NUMBER, NO_MATCH, SHORT_NSN_MATCH, NSN_MATCH, EXACT_MATCH
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 308
    //                   0 330
    //                   1 337
    //                   2 344
    //                   3 351;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_351;
_L3:
        byte byte1 = 2;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 13;
          goto _L9
_L5:
        byte1 = 47;
          goto _L9
_L6:
        byte1 = 17;
          goto _L9
        byte1 = 58;
          goto _L9
    }
}
