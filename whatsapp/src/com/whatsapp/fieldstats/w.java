// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class w extends Enum
{

    public static final w BB_ALTERNATE_APN;
    public static final w BB_BES;
    public static final w BB_BIS;
    public static final w DIRECT;
    public static final w WAP;
    private static final w b[];
    private static final String z[];
    private final int a;

    private w(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/whatsapp/fieldstats/w, s);
    }

    public static w[] values()
    {
        return (w[])b.clone();
    }

    public int getCode()
    {
        return a;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "Y`pm>I";
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
                obj = "_k}j4N";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "_k}i1Ilpf<Il}i-S";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Jhr";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "_k}j8N";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                DIRECT = new w(z[0], 0, 0);
                WAP = new w(z[3], 1, 1);
                BB_BIS = new w(z[1], 2, 2);
                BB_BES = new w(z[4], 3, 3);
                BB_ALTERNATE_APN = new w(z[2], 4, 4);
                b = (new w[] {
                    DIRECT, WAP, BB_BIS, BB_BES, BB_ALTERNATE_APN
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 312
    //                   0 335
    //                   1 342
    //                   2 349
    //                   3 356;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_356;
_L3:
        byte byte1 = 125;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 29;
          goto _L9
_L5:
        byte1 = 41;
          goto _L9
_L6:
        byte1 = 34;
          goto _L9
        byte1 = 40;
          goto _L9
    }
}
