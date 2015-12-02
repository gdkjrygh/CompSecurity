// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class h extends Enum
{

    public static final h BUSY;
    public static final h NOT_ALLOWED;
    public static final h NO_MESSAGES;
    public static final h SUCCESS;
    private static final h a[];
    private static final String z[];
    private final int b;

    private h(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/whatsapp/fieldstats/h, s);
    }

    public static h[] values()
    {
        return (h[])a.clone();
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
        obj = "5$\022.";
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
                obj = "$$\0024 $\"";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "9>\025($;=\016  3";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "9>\036: $\"\0000 $";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                SUCCESS = new h(z[1], 0, 1);
                NO_MESSAGES = new h(z[3], 1, 2);
                BUSY = new h(z[0], 2, 3);
                NOT_ALLOWED = new h(z[2], 3, 4);
                a = (new h[] {
                    SUCCESS, NO_MESSAGES, BUSY, NOT_ALLOWED
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
        byte byte0 = 101;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 119;
          goto _L9
_L5:
        byte0 = 113;
          goto _L9
_L6:
        byte0 = 65;
          goto _L9
        byte0 = 119;
          goto _L9
    }
}
