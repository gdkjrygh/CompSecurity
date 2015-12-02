// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class ow extends Enum
{

    public static final ow BOTH;
    public static final ow LEFT;
    public static final ow NONE;
    public static final ow RIGHT;
    private static final ow a[];
    private static final String z[];

    private ow(String s, int i)
    {
        super(s, i);
    }

    public static ow valueOf(String s)
    {
        return (ow)Enum.valueOf(com/whatsapp/ow, s);
    }

    public static ow[] values()
    {
        return (ow[])a.clone();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\t Z\n";
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
                obj = "\031&I\n\t";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\005 @\007";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\007*H\026";
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                NONE = new ow(z[2], 0);
                LEFT = new ow(z[3], 1);
                RIGHT = new ow(z[1], 2);
                BOTH = new ow(z[0], 3);
                a = (new ow[] {
                    NONE, LEFT, RIGHT, BOTH
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 272
    //                   0 293
    //                   1 299
    //                   2 305
    //                   3 311;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_311;
_L3:
        byte byte0 = 93;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 75;
          goto _L9
_L5:
        byte0 = 111;
          goto _L9
_L6:
        byte0 = 14;
          goto _L9
        byte0 = 66;
          goto _L9
    }
}
