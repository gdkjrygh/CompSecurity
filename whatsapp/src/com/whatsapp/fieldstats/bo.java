// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;


public final class bo extends Enum
{

    public static final bo CANCEL;
    public static final bo DID_NOT_REQUEST;
    public static final bo FAILED;
    public static final bo OK;
    private static final bo a[];
    private static final String z[];
    private final int b;

    private bo(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static bo valueOf(String s)
    {
        return (bo)Enum.valueOf(com/whatsapp/fieldstats/bo, s);
    }

    public static bo[] values()
    {
        return (bo[])a.clone();
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
        obj = "oY\030F\025`";
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
                obj = "hQ\022Z\036cL\tW\025}M\023V\004";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "jY\037I\025h";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "cS";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                OK = new bo(z[3], 0, 1);
                CANCEL = new bo(z[0], 1, 2);
                DID_NOT_REQUEST = new bo(z[1], 2, 3);
                FAILED = new bo(z[2], 3, 4);
                a = (new bo[] {
                    OK, CANCEL, DID_NOT_REQUEST, FAILED
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
        byte byte0 = 80;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 44;
          goto _L9
_L5:
        byte0 = 24;
          goto _L9
_L6:
        byte0 = 86;
          goto _L9
        byte0 = 5;
          goto _L9
    }
}
